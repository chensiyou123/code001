package com.csy.code007.service;

import com.csy.code007.dao.HappinessDao;
import com.csy.code007.entity.Happiness;
import com.csy.code007.utils.UUIDUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class HappinessService {

    @Autowired
    private HappinessDao happinessDao;
    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public void insertService(){
        Happiness happiness= new Happiness();
        happiness.setCity("西安");
        happiness.setNum(9421);
        happiness.setId(UUIDUtils.getUUID());
        happinessDao.insertHappiness(happiness);
    }

    public List<Happiness> query(){
        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
        PageHelper.startPage(1, 2);
        List<Happiness> allItems = happinessDao.query();        //全部商品
        return allItems;
    }

}
