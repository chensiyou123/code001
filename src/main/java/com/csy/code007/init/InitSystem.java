package com.csy.code007.init;

import com.csy.code007.entity.ArcType;
import com.csy.code007.service.ArcTypeService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

@Component("initSystem")
public class InitSystem implements ServletContextListener,ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ArcTypeService arcTypeService=  (ArcTypeService)applicationContext.getBean("arcTypeService");
        List<ArcType>arcTypeList = arcTypeService.query();
        servletContextEvent.getServletContext().setAttribute("allArcTypeList", arcTypeList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

}
