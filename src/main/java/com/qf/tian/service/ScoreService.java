package com.qf.tian.service;

import com.qf.tian.common.result.RespResult;

public interface ScoreService {
    public RespResult<String> sign(int scoreType, Long scoreMemberId, int scoreSize);
}
