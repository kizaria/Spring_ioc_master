package com.liuyunsong.second.main;

import com.liuyunsong.second.config.config;
import com.liuyunsong.second.dao.Listcommand;
import com.liuyunsong.second.service.Listservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        Listservice listservice = context.getBean(Listservice.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listservice.showList());


    }
}
