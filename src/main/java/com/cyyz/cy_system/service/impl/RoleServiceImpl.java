package com.cyyz.cy_system.service.impl;

import com.cyyz.cy_system.infrastructure.dao.RoleMapper;
import com.cyyz.cy_system.domain.model.Role;
import com.cyyz.cy_system.service.RoleService;
import com.cyyz.cy_system.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Shz on 2018/08/30.
 */
@Service
@Transactional
public class RoleServiceImpl extends BaseService<Role> implements RoleService {
    @Resource
    private RoleMapper aaRoleMapper;

}
