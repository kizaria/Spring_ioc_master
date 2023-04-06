package com.liuyunsong.fourth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("${student.name}")
    private String name;

    @Value("${student.age}")
    private int age;

    @Value("其它信息")
    private String another;

    @Value("#{T(java.lang.Math).random()*100}")
    private int id;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAnother() {
        return another;
    }

    public int getId() {
        return id;
    }
}
