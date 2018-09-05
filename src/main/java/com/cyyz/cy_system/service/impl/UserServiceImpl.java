package com.cyyz.cy_system.service.impl;

import com.cyyz.cy_system.infrastructure.dao.UserMapper;
import com.cyyz.cy_system.domain.model.User;
import com.cyyz.cy_system.service.UserService;
import com.cyyz.cy_system.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Shz on 2018/08/30.
 */
@Service
@Transactional
public class UserServiceImpl extends BaseService<User> implements UserService {
    @Resource
    private UserMapper aaUserMapper;

}
