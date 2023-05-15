package com.qf.tian.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Sign {
    /**
     * 主键
     */
    private Integer signId;

    /**
     * 签到日期
     */
    private Date signDate;

    /**
     * 签到人ID
     */
    private Long signMemberId;

    /**
     * 1正常，0删除
     */
    private Integer signStatus;
}

