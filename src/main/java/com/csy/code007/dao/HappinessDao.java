package com.csy.code007.dao;

import com.csy.code007.entity.Happiness;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HappinessDao {
    Happiness findHappinessByCity(@Param("city") String city);
    int insertHappiness(Happiness happiness);
    List<Happiness>query();
}
