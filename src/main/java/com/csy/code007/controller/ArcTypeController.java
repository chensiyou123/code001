package com.csy.code007.controller;

import com.csy.code007.service.ArcTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/arcType")
public class ArcTypeController {
    @Autowired
    private ArcTypeService arcTypeService;

    @GetMapping
    public List query(){
        return arcTypeService.query();
    }

}
