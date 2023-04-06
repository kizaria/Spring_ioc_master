package com.liuyunsong.third.dao.impl;

import com.liuyunsong.third.dao.Dessert;
import org.springframework.stereotype.Repository;

@Repository
public class Icecream implements Dessert {

    @Override
    public void showName() {
        System.out.println("冰淇淋");
    }
}
