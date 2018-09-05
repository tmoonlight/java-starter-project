package com.cyyz.cy_system.service;
import com.cyyz.cy_system.domain.model.StampOrder;

import java.util.List;
//import com.cyyz.cy_system.service;


/**
 * Created by Shz on 2018/03/26.
 */
public interface StampOrderService extends Service<StampOrder> {

    List<StampOrder> GetByTestSql();

    List<StampOrder> TestUpdateData();
}
