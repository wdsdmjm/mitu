package com.qfedu.mitu.comment.exhandler;

import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.comment.vo.ResultUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author gfc
 * 2018年12月12日 下午 3:56
 */
@RestControllerAdvice
public class NullPointHandler {
    @ExceptionHandler(NullPointerException.class)
    public Result error() {
        return ResultUtil.setOtherERROR("请求参数格式不正确");
    }
}
