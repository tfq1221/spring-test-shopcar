package com.qf.tian.common.handler;


import com.qf.tian.common.result.RespResult;
import com.qf.tian.exception.BaseException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常如何处理
 * 自定义异常  扩展异常(让异常有意义,方便开发排查)  控制层异常  业务层异常 数据层异常
 * 原则
 * 能抛出异常抛出异常
 */
//Rest 前后端分离

/**
 * 错误通知
 */

@Component
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public RespResult<Object> handlerException(Exception ex) {
        System.out.println(ex.getMessage());
        return RespResult.error();
    }

    @ExceptionHandler(BaseException.class)
    public RespResult<Object> handlerBaseException(BaseException ex) {
        return RespResult.error(ex.getResultCode());
    }
}
