package com.qf.tian.exception;

import com.qf.tian.common.result.ResultCode;

public class DaoException extends BaseException {

    public DaoException(ResultCode resultCode) {
        super(resultCode);
    }
}
