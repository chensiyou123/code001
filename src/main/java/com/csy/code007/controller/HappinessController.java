package com.csy.code007.controller;

import com.csy.code007.entity.Happiness;
import com.csy.code007.service.HappinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/uappiness")
public class HappinessController {
    @Autowired
    private HappinessService happinessService;
    @RequestMapping("/query")
    public Happiness testQuery(){
        return happinessService.selectService("北京");
    }

    @RequestMapping("/insert")
    public Happiness testInsert(){
        happinessService.insertService();
        return happinessService.selectService("西安");
    }

    @GetMapping
    public List<Happiness> query(){

        return happinessService.query();
    }


}
