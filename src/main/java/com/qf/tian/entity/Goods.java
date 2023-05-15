package com.qf.tian.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Goods {
    /**
     * 货物id
     */
    private Integer goodId;

    /**
     * 上级分类id
     */
    private Integer goodParentId;

    /**
     * 名称
     */
    private String goodName;

    /**
     * 排序
     */
    private Integer goodSort;

    /**
     * 是否显示,1为展示，0不展示
     */
    private Byte isShow;

    /**
     * 创建时间’
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}

