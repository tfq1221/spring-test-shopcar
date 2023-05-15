package com.qf.tian.mapper;

import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    int updateScoreBySign(@Param("scoreType") int scoreType, @Param("scoreMemberId") Long scoreMemberId,@Param("scoreSize") int scoreSize);
}
