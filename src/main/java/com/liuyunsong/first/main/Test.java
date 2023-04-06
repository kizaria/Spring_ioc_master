package com.liuyunsong.first.main;

import com.liuyunsong.first.config.BrushConfig;
import com.liuyunsong.first.dao.Brush;
import com.liuyunsong.first.service.BrushService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        System.setProperty("spring.profiles.active", "test");

        ApplicationContext context=new AnnotationConfigApplicationContext(BrushConfig.class);

        BrushService brush= context.getBean(BrushService.class);

        brush.color();

    }
}
