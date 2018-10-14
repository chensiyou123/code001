package com.csy.code007.service;

import com.csy.code007.dao.HappinessDao;
import com.csy.code007.dao.UserDao;
import com.csy.code007.entity.Happiness;
import com.csy.code007.entity.User;
import com.csy.code007.utils.UUIDUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Map query(){
        Map resultMap = new HashMap();
        PageHelper.startPage(1,5);
        List<User> list = userDao.query();
        PageInfo pageInfo = new PageInfo(list);
        resultMap.put("data",pageInfo);
        return resultMap;
    }

}
