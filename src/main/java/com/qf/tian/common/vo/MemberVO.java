package com.qf.tian.common.vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MemberVO {
    /**
     * 主键
     */
    private Long memberId;

    /**
     * 会员名
     */
    private String memberName;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 密码(View Object 无需返回密码)
     */
//    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 注册日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH")
    private Date createDate;



    /**
     * 1.正常 0.表示激活/删除
     */
    private Integer status;
}