package com.cyyz.cy_system.service.impl;

import com.cyyz.cy_system.domain.model.QuoteItem;
import com.cyyz.cy_system.infrastructure.dao.QuoteItemMapper;
import com.cyyz.cy_system.infrastructure.dao.StampOrderMapper;
import com.cyyz.cy_system.domain.model.StampOrder;
import com.cyyz.cy_system.service.StampOrderService;
import com.cyyz.cy_system.service.BaseService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;

import javax.annotation.Resource;
import java.util.List;



/**
 * Created by Shz on 2018/03/26.
 */
@Service
@Transactional
public class StampOrderServiceImpl extends BaseService<StampOrder> implements StampOrderService {
    @Resource
    private StampOrderMapper saStamporderMapper;

    @Resource
    private QuoteItemMapper  quoteItemMapper;


    @Override
    public List<StampOrder> GetByTestSql() {

        return saStamporderMapper.GetSomeData();
    }

    @Override
    public List<StampOrder> TestUpdateData() {
            //saStamporderMapper.updateByCondition();
       // quoteItemMapper.selectByCondition()
        //Condition cond = new Condition(QuoteItem.class);
//        Condition cond = new Condition(StampOrder.class);
  //      cond.createCriteria().andCondition("StampUnit like '%科技有限公司%'");
       // return quoteItemMapper.selectByCondition(cond);
       //return  saStamporderMapper.selectByCondition(cond);

        //return  saStamporderMapper.selectAll();

        return  saStamporderMapper.selectAdv();



        //return saStamporderMapper.GetSomeData();
    }
}
