package com.qfedu.mitu.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qfedu.mitu.comment.utils.ConvertUtil;
import com.qfedu.mitu.comment.utils.GetPageData;
import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.comment.vo.ResultUtil;
import com.qfedu.mitu.domain.TComment;
import com.qfedu.mitu.mapper.TCommentMapper;
import com.qfedu.mitu.service.TCommentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
@Service
public class TCommentServiceImpl extends ServiceImpl<TCommentMapper, TComment> implements TCommentService {

    @Autowired
    private TCommentMapper mapper;

    @Override
    public Result showCommentById(Integer id) {

        mapper.selectById(id);
        if (id != null || id != 0) {
            return ResultUtil.setOK("评论详情", id);
        }else {
            return ResultUtil.setERROR("查询评论详情");
        }


    }

    @Override
    public Result showAllComments(Integer page) {

        PageHelper.startPage(GetPageData.getPageNum(page + ""), 10);
        List<Map<String, Object>> comments = mapper.selectAll();
        PageInfo<Map<String, Object>> commentsPage = new PageInfo<>(comments);
        return ConvertUtil.convert("分页查询评论", commentsPage);
    }
}
