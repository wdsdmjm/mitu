package com.qfedu.mitu.mapper;

import com.qfedu.mitu.domain.TComment;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
public interface TCommentMapper extends BaseMapper<TComment> {

    List<TComment> selectById(Integer id);
    List<Map<String, Object>> selectAll();
}