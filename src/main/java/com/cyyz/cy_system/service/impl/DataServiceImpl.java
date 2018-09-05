package com.cyyz.cy_system.service.impl;

import com.cyyz.cy_system.infrastructure.dao.DataMapper;
import com.cyyz.cy_system.domain.model.Data;
import com.cyyz.cy_system.service.DataService;
import com.cyyz.cy_system.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Shz on 2018/08/30.
 */
@Service
@Transactional
public class DataServiceImpl extends BaseService<Data> implements DataService {
    @Resource
    private DataMapper aaDataMapper;

}
