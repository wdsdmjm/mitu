package com.qfedu.mitu.comment.exhandler;

import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.comment.vo.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author gfc
 * 2018年12月12日 下午 10:32
 */
@RestControllerAdvice
public class IllegalStateExceptionHandler {
    @ExceptionHandler(IllegalStateException.class)
    public Result handler() {
        return ResultUtil.setOtherERROR("参数不合法");
    }
}
