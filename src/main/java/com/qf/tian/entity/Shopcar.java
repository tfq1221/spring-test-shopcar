package com.qf.tian.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Shopcar {
    /**
     *
     */
    private Integer shopcarId;

    /**
     *
     */
    private Long shopcarMemberId;

    /**
     *
     */
    private Integer shopcarGoodsId;

    /**
     *
     */
    private Integer shopcarGoodsNumber;

    /**
     * 1正常，0删除
     */
    private Byte status;

    /**
     *
     */
    private Date createTime;

    /**
     *
     */
    private Date updateTime;
}

