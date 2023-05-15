package com.qf.tian.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Score {
    /**
     * 主键
     */
    private Integer scoreId;

    /**
     * 会员名
     */
    private String scoreType;

    /**
     * 昵称
     */
    private String scoreSize;

    /**
     * 得分人id
     */
    private Long scoreMemberId;

    /**
     * 注册日期
     */
    private Date scoreDate;

    /**
     * 1.正常/0.删除
     */
    private Integer scoreStatus;
}

