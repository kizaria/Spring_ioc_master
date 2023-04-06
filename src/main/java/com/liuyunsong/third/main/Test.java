package com.liuyunsong.third.main;

import com.liuyunsong.third.config.config;

import com.liuyunsong.third.service.DessertShop;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        DessertShop dessertShop=context.getBean(DessertShop.class);

        dessertShop.showName();




    }
}
