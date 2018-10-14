package com.csy.code007.dao;

import com.csy.code007.entity.ArcType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ArcTypeDao {
    List<ArcType>query(Map map);
}
