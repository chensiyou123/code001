package com.csy.code007.dao;

import com.csy.code007.entity.Happiness;
import com.csy.code007.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {

    List<User>query();
}
