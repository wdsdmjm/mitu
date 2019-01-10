package com.qfedu.mitu.service.impl;

import com.qfedu.mitu.comment.vo.Result;
import com.qfedu.mitu.comment.vo.ResultUtil;
import com.qfedu.mitu.domain.TSign;
import com.qfedu.mitu.mapper.TSignMapper;
import com.qfedu.mitu.service.TSignService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zcg
 * @since 2019-01-06
 */
@Service
public class TSignServiceImpl extends ServiceImpl<TSignMapper,TSign> implements TSignService {
    @Autowired
    private TSignMapper tSignDao;

    @Override
    public Result judgesame(Integer uid) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        TSign sign = tSignDao.lastsign(uid);
        String data = df.format(sign.getLastTime());//数据库中取到的日期
        if (!date.equals(data)){
            return ResultUtil.setOtherOK("未签到",sign);
        }
        return ResultUtil.setdataERROR("已签到",sign);
    }

    @Override
    public Result addsign(Integer uid) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");//设置日期格式
        Date date = new Date();
        TSign signs = tSignDao.lastsign(uid);
        Date data = signs.getLastTime();
        int statu = signs.getStatu();
        String date1=df.format(date);
        String data1=df.format(data);
        if (data.equals("") || data.equals("null") || data.getTime() == 0){
            signs.setSignCount(1);
            signs.setStatu(5);
            signs.setUid(uid);
            tSignDao.insertsign(signs);
            return ResultUtil.setOK("签到",null);
        }else {
            if ((Math.abs((int) date.getTime() - (int) data.getTime()) / 3600000) / 24 < 2  && date1.equals(data1)){
                int signCount = signs.getSignCount() + 1;
                signs.setSignCount(signCount);
                signs.setStatu(statu + 10);
                signs.setUid(uid);
                tSignDao.insertsign(signs);
                return ResultUtil.setOK("签到",null);
            }else {
                signs.setSignCount(1);
                signs.setStatu(statu + 5);
                signs.setUid(uid);
                tSignDao.insertsign(signs);
                return ResultUtil.setOK("签到",null);
            }
        }
    }

    @Override
    public Result updatesign(Integer uid) {
        TSign signs1 = tSignDao.penultsign(uid);
        int status = signs1.getStatu();
        TSign signs = tSignDao.lastsign(uid);
        int differ = signs.getStatu();
        if ((differ - status) < 20 ){
            if (signs.getSignCount() == 7){
                signs.setStatu(signs.getStatu() + 20);
                signs.setUid(signs.getId());
                tSignDao.updateByUid(signs);
                return ResultUtil.setOK("已领取",null);
            }else if(signs.getSignCount() == 21){
                signs.setStatu(signs.getStatu() + 30);
                signs.setUid(signs.getId());
                tSignDao.updateByUid(signs);
                return ResultUtil.setOK("已领取",null);
            }else if (signs.getSignCount() == 30){
                signs.setStatu(signs.getStatu() + 50);
                signs.setUid(signs.getId());
                tSignDao.updateByUid(signs);
                return ResultUtil.setOK("已领取",null);
            }
            return ResultUtil.setERROR("领取");
        }else {
            return ResultUtil.setERROR("已领取");
        }
    }
}
