package com.liuyunsong.fourth.main;

import com.liuyunsong.fourth.Sconfig.config;
import com.liuyunsong.fourth.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        Student stu=context.getBean(Student.class);

        Environment env = context.getEnvironment();
        System.out.println("student.name:" + env.getProperty("student.name"));
        System.out.println("student.age:" + env.getProperty("student.age"));
        System.out.println("***************************");

        System.out.println("student.name:" + stu.getName());
        System.out.println("student.age:" + stu.getAge());
        System.out.println("student.another:" + stu.getAnother());
        System.out.println("生成的随机数是:" + stu.getId());

    }
}
