package com.cyyz.cy_system.service.impl;

import com.cyyz.cy_system.infrastructure.dao.ShaoTempMapper;
import com.cyyz.cy_system.domain.model.ShaoTemp;
import com.cyyz.cy_system.service.ShaoTempService;
import com.cyyz.cy_system.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Shz on 2018/08/30.
 */
@Service
@Transactional
public class ShaoTempServiceImpl extends BaseService<ShaoTemp> implements ShaoTempService {
    @Resource
    private ShaoTempMapper shaoTempMapper;

}
