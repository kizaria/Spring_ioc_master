package com.liuyunsong.first.dao.impl;

import com.liuyunsong.first.dao.Brush;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;


@Repository("RedBrush")
@Profile("production")
public class RedBrush implements Brush {
    @Override
    public void color() {
        System.out.println("使用红色笔刷");
    }
}
