package com.liuyunsong.second.dao.impl;

import com.liuyunsong.second.Condition.WindowsCondition;
import com.liuyunsong.second.dao.Listcommand;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
@Conditional(WindowsCondition.class)
public class WinList implements Listcommand {

    public WinList() {
        System.out.println("这是windows");
    }

    @Override
    public String showList() {
        return "dir";
    }
}
