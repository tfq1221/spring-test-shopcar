package com.qf.tian.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig(locations = {"classpath:spring-context.xml", "classpath:spring-mybatis.xml", "classpath:spring-druid.xml"})
class ShopcarMapperTest {
@Autowired
ShopcarMapper shopcarMapper;
    @Test
    void insertShopcar() {
        shopcarMapper.InsertShopcar(1,1,10);
    }
}