package com.qf.tian.mapper;

import com.alibaba.druid.sql.visitor.functions.Insert;
import com.qf.tian.entity.Shopcar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopcarMapper {
   int insertShopcar(@Param("shopcarMemberId") long shopcarMemberId,@Param("shopcarGoodsId") int shopcarGoodsId,
                     @Param("shopcarGoodsNumber") int shopcarGoodsNumber);

   List<Shopcar> selectShopcarByMemberId(long shopcarByMemberId);

   float selectPrice(int goodId);
}
