package com.liuyunsong.second.dao.impl;

import com.liuyunsong.second.Condition.LinuxCondition;
import com.liuyunsong.second.Condition.WindowsCondition;
import com.liuyunsong.second.dao.Listcommand;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Repository;


@Repository
@Conditional(LinuxCondition.class)
public class LinuxList implements Listcommand {

    public LinuxList() {
        System.out.println("这是linux");
    }

    @Override
    public String showList() {
        return "ls";
    }
}
