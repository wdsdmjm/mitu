package com.qfedu.mitu.controller;

import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.service.TFoodsService;
import com.qfedu.mitu.service.impl.TFoodsOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
@Controller
@RequestMapping("/qfedu.mitu/tFoodsOrder")
public class TFoodsOrderController {
//    @Autowired
//    private TFoodsOrderServiceImpl tFoodsOrderService;
//
//    @GetMapping("/selectTFoodsOrder")
//    public Result selectTFoodsOrder(Integer uid){
//        return tFoodsOrderService.selectTFoodsOrder(uid);
//    }
}
