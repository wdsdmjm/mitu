package com.qfedu.mitu.service.impl;

import com.qfedu.mitu.domain.User;
import com.qfedu.mitu.mapper.UserMapper;
import com.qfedu.mitu.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author D.Yang
 * @since 2019-01-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
}
