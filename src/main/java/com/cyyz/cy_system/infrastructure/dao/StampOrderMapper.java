package com.cyyz.cy_system.infrastructure.dao;

import com.cyyz.cy_system.domain.model.StampOrder;
import com.cyyz.cy_system.infrastructure.mapper.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//这里写sql脚本,复杂的脚本也可写在xml里
public interface StampOrderMapper extends Mapper<StampOrder> {

    @Select("select top 10 * from sa_stamporder")
    List<StampOrder> GetSomeData();


    //sql在xml里
    List<StampOrder> selectAdv();
}