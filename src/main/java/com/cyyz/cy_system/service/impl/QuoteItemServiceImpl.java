package com.cyyz.cy_system.service.impl;

import com.cyyz.cy_system.infrastructure.dao.QuoteItemMapper;
import com.cyyz.cy_system.domain.model.QuoteItem;
import com.cyyz.cy_system.service.QuoteItemService;
import com.cyyz.cy_system.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Shz on 2018/03/23.
 */
@Service
@Transactional
public class QuoteItemServiceImpl extends BaseService<QuoteItem> implements QuoteItemService {
    @Resource
    private QuoteItemMapper saStampquoteitemMapper;

    @Override
    public void QuoteStart() {

    }
    //服务
}
