package com.qfedu.mitu.service;

import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.domain.TComment;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
public interface TCommentService extends IService<TComment> {

    Result showCommentById(Integer id);
    Result showAllComments(Integer page);
}
