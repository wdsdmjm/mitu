package com.qfedu.mitu.controller;

import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.service.TCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
@RestController
@RequestMapping("/api/v1")
public class TCommentController {

    @Autowired
    private TCommentService service;

    @PostMapping("/comment")
    public Result getComment(Integer id) {

        return service.showCommentById(id);
    }
    @PostMapping("/comments")
    public Result getAll(Integer page) {

        return service.showAllComments(page);
    }
}
