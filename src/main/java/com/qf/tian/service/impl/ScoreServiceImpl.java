package com.qf.tian.service.impl;

import com.qf.tian.common.result.RespResult;
import com.qf.tian.common.result.ResultCode;
import com.qf.tian.exception.ServiceException;
import com.qf.tian.mapper.ScoreMapper;
import com.qf.tian.mapper.SignMapper;
import com.qf.tian.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

@Service
public class ScoreServiceImpl implements ScoreService {
    @Autowired
    ScoreMapper scoreMapper;
    @Autowired
    SignMapper signMapper;

    /**
     * 签到记录
     * 累计加积分
     *  1000  + 10
     * @param scoreType
     * @param scoreMemberId
     * @param scoreSize
     * @return
     */
    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public RespResult<String> sign(int scoreType, Long scoreMemberId, int scoreSize) {
        try {
            signMapper.insertSign(scoreMemberId);
            int i = scoreMapper.updateScoreBySign(scoreType, scoreMemberId, 10);
            if (i == 1) {
                return RespResult.success("签到成功");
            } else {
                throw new ServiceException(ResultCode.SIGN_SCORE_ERROR);
            }
        } catch (Exception exception) {
            throw new ServiceException(ResultCode.SYS_ERROR);
        }
    }
}
