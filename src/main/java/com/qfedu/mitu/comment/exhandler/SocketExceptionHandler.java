package com.qfedu.mitu.comment.exhandler;

import com.qfedu.mitu.comment.constant.Constant;
import com.qfedu.mitu.comment.utils.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.SocketException;

/**
 * @author gfc
 * 2018年12月10日 下午 7:17
 */
@RestControllerAdvice
public class SocketExceptionHandler {
    @Autowired
    private JedisUtil jedisUtil;

    @ExceptionHandler(value = {SocketException.class})
    public void handler(HttpServletResponse response, HttpServletRequest request) throws IOException {
        jedisUtil.delHash(Constant.TOKENKEY, request.getHeader("token"));
        jedisUtil.delHash(Constant.CODETOKENKEY, "token" + request.getHeader("token"));
        response.getWriter().print("<script>alert('登录超时')</script>");
    }

}
