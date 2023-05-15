package com.qf.tian.exception;

import com.qf.tian.common.result.ResultCode;

public class ServiceException extends BaseException {

    public ServiceException(ResultCode resultCode) {
        super(resultCode);
    }
}
