package com.qf.tian.service.impl;

import com.alibaba.druid.sql.ast.statement.SQLIfStatement;
import com.qf.tian.common.result.RespResult;
import com.qf.tian.common.result.ResultCode;
import com.qf.tian.common.utils.CommonBeanUtils;
import com.qf.tian.common.vo.ShopcarVO;
import com.qf.tian.entity.Shopcar;
import com.qf.tian.exception.ServiceException;
import com.qf.tian.mapper.ShopcarMapper;
import com.qf.tian.mapper.SignMapper;
import com.qf.tian.service.ShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopcarServiceImpl implements ShopcarService {
    @Autowired
    ShopcarMapper shopcarMapper;


    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public RespResult<String> addShopcar(long shopcarMemberId,int shopcarGoodsId,int shopcarGoodsNumber) {
        try {
            int i = shopcarMapper.insertShopcar(shopcarMemberId, shopcarGoodsId, shopcarGoodsNumber);
            if (i == 1) {
                return RespResult.success("添加成功");
            } else {
                throw new ServiceException(ResultCode.SHOPCAR_INSERT_ERROR);
            }
        } catch (Exception exception) {
            throw new ServiceException(ResultCode.SYS_ERROR);
        }
    }
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public RespResult<List<ShopcarVO>> listShopcar(long shopcarMemberId) {
        try {
            List<Shopcar> shopcars = shopcarMapper.selectShopcarByMemberId(shopcarMemberId);
            if (!ObjectUtils.isEmpty(shopcars)) {
                List<ShopcarVO> shopcarVOS = new ArrayList<>();
                ShopcarVO shopcarVO = new ShopcarVO();
                shopcars.stream().forEach(
                        e -> {
                            shopcarVO.setShopcar(e);
                            shopcarVO.setPrice(shopcarMapper.selectPrice(e.getShopcarGoodsId()));
                            shopcarVOS.add(shopcarVO);
                        }
                );
                return RespResult.success(shopcarVOS);
            } else {
                return RespResult.error(ResultCode.MEMBER_NOT_EXIST);
            }
        } catch (Exception exception) {
            throw new ServiceException(ResultCode.SYS_ERROR);
        }
    }
}
