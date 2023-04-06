package com.liuyunsong.first.dao.impl;

import com.liuyunsong.first.dao.Brush;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository("GreenBrush")
@Profile("dev")
public class GreenBrush implements Brush {

    @Override
    public void color() {
        System.out.println("使用绿色笔刷");
    }
}
