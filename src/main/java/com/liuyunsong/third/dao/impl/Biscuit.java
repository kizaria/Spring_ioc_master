package com.liuyunsong.third.dao.impl;

import com.liuyunsong.third.dao.Dessert;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class Biscuit implements Dessert {
    @Override
    public void showName() {
        System.out.println("饼干");
    }
}
