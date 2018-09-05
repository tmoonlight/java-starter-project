package com.cyyz.cy_system.service.impl;

import com.cyyz.cy_system.infrastructure.dao.ShaoTemp2Mapper;
import com.cyyz.cy_system.domain.model.ShaoTemp2;
import com.cyyz.cy_system.service.ShaoTemp2Service;
import com.cyyz.cy_system.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Shz on 2018/08/30.
 */
@Service
@Transactional
public class ShaoTemp2ServiceImpl extends BaseService<ShaoTemp2> implements ShaoTemp2Service {
    @Resource
    private ShaoTemp2Mapper shaoTemp2Mapper;

}
