package com.liuyunsong.third.dao.impl;

import com.liuyunsong.third.dao.Dessert;
import org.springframework.stereotype.Repository;

@Repository
public class Cake implements Dessert {

    @Override
    public void showName() {
        System.out.println("蛋糕");
    }
}
