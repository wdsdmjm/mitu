package com.qfedu.mitu.mapper;

import com.qfedu.mitu.domain.TSign;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
public interface TSignMapper extends BaseMapper<TSign> {

    TSign lastsign(Integer uid);

    void insertsign(TSign signs);

    TSign penultsign(Integer uid);

    void updateByUid(TSign signs);
}