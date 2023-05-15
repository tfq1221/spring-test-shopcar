package com.qf.tian.common.result;

import com.qf.tian.entity.Shopcar;
import lombok.Getter;

@Getter
public enum ResultCode {
//   枚举类相当于有固定属性的对象
    SUCCESS(200,"success"),
    SYS_ERROR(40000,"error"),
    USER_PASSWORD_ERROR(41000,"user_password_error"),
    USER_EXIST(42000,"user_exist"),
    MEMBER_IS_LOCKED(43000,"member_is_locked"),
    MEMBER_NOT_EXIST(45000,"member_not_exist"),
    PARAM_ERROR(46000,"param_error"),
    SIGN_SCORE_ERROR(47000,"sign_score_error"),
    SHOPCAR_INSERT_ERROR(48000,"shopcar_insert_error");
    final int code;
    final String msg;

    ResultCode(int code, String msg) {
        this.code =code ;
        this.msg=msg;
    }
}
