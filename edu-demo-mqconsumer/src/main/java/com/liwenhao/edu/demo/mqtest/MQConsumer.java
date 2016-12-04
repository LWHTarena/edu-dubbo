package com.liwenhao.edu.demo.mqtest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ActiveMQ测试启动类
 * @author lwh
 * @folder com.liwenhao.edu.demo.mqtest
 * @date 2016/9/19.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class MQConsumer {
    private static final Log log = LogFactory.getLog(MQConsumer.class);

    public static void main(String[] args) {
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
            context.start();
        } catch (Exception e) {
            log.error("==>MQ context start error:", e);
            System.exit(0);
        }
    }
}
