package com.liuyunsong.fourth.Sconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

@ComponentScan("com.liuyunsong.fourth")

@PropertySource("classpath:Student.properties")

public class config {
}
