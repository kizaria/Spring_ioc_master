package com.liuyunsong.second.service.impl;

import com.liuyunsong.second.dao.Listcommand;
import com.liuyunsong.second.service.Listservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Listserviceimpl implements Listservice {

    @Autowired
    Listcommand listcommand;

    @Override
    public String showList() {
       return listcommand.showList();
    }
}
