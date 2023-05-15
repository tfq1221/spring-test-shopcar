package com.qf.tian.exception;

import com.qf.tian.common.result.ResultCode;

public class ControllerException extends BaseException {

    public ControllerException(ResultCode resultCode) {
        super(resultCode);
    }
}
