package com.qfedu.mitu.service.impl;

import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.domain.TFoodsOrder;
import com.qfedu.mitu.mapper.TFoodsOrderMapper;
import com.qfedu.mitu.service.TFoodsOrderService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
@Service
public class TFoodsOrderServiceImpl extends ServiceImpl<TFoodsOrderMapper, TFoodsOrder> implements TFoodsOrderService {

    @Override
    public Result selectTFoodsOrder(Integer uid) {
        
        return null;
    }
}
