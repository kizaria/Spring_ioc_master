package com.liuyunsong.first.dao.impl;

import com.liuyunsong.first.dao.Brush;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;

@Repository("BlueBrush")
@Profile("test")
public class BlueBrush implements Brush {

    @Override
    public void color() {
        System.out.println("使用蓝色笔刷");
    }
}
