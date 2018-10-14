package com.csy.code007.service;

import com.csy.code007.dao.ArcTypeDao;
import com.csy.code007.dao.UserDao;
import com.csy.code007.entity.ArcType;
import com.csy.code007.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArcTypeService {

    @Autowired
    private ArcTypeDao arcTypeDao;

    public List query(){
        Map resultMap = new HashMap();
        List<ArcType> list = arcTypeDao.query(null);
        return list;
    }

}
