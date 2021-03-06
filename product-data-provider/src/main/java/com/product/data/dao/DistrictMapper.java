package com.product.data.dao;

import com.product.data.pojo.District;

public interface DistrictMapper {

    int deleteByPrimaryKey(Integer guid);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer guid);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}