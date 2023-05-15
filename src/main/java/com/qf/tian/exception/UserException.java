package com.qf.tian.exception;

import com.qf.tian.common.result.ResultCode;

public class UserException extends BaseException{
    public UserException(ResultCode resultCode) {
        super(resultCode);
    }
}
