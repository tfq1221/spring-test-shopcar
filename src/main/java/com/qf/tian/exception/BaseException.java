package com.qf.tian.exception;

import com.qf.tian.common.result.ResultCode;
import lombok.Data;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private ResultCode resultCode;
    public BaseException(ResultCode resultCode){this.resultCode=resultCode;
    }
}
