package com.liuyunsong.first.service.impl;

import com.liuyunsong.first.dao.Brush;
import com.liuyunsong.first.service.BrushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrushServiceimpl implements BrushService {

    @Autowired
    Brush brush;

    @Override
    public void color() {
        brush.color();
    }
}
