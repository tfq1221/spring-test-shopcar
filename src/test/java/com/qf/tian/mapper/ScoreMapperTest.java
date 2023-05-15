package com.qf.tian.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitConfig(locations = {"classpath:spring-context.xml", "classpath:spring-mybatis.xml", "classpath:spring-druid.xml"})
class ScoreMapperTest {
@Autowired
ScoreMapper scoreMapper;
    @Test
    void updateScoreBySign() {
        scoreMapper.updateScoreBySign(0,(long)1,10);
    }
}