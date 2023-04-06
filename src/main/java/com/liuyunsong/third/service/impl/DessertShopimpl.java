package com.liuyunsong.third.service.impl;

import com.liuyunsong.third.dao.Dessert;
import com.liuyunsong.third.service.DessertShop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DessertShopimpl implements DessertShop {

    @Autowired
    Dessert dessert;


    @Override
    public void showName() {
        dessert.showName();
    }
}
