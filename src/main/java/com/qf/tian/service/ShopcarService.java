package com.qf.tian.service;

import com.qf.tian.common.result.RespResult;
import com.qf.tian.common.vo.ShopcarVO;

import java.util.List;

public interface ShopcarService {
    RespResult<String> addShopcar(long shopcarMemberId,int shopcarGoodsId,int shopcarGoodsNumber);

     RespResult<List<ShopcarVO>> listShopcar(long shopcarMemberId);
}
