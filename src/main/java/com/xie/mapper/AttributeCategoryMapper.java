package com.xie.mapper;

import com.xie.bean.AttributeCategory;

import java.util.List;

public interface AttributeCategoryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AttributeCategory record);

    int insertSelective(AttributeCategory record);

    AttributeCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttributeCategory record);

    int updateByPrimaryKey(AttributeCategory record);


    List<AttributeCategory> select();

    int count();
}