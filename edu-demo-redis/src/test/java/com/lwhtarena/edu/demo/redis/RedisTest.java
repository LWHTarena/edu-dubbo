package com.lwhtarena.edu.demo.redis;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import redis.clients.jedis.Jedis;

/**
 * Redis测试
 * @author lwh
 * @folder com.lwhtarena.edu.demo.redis
 * @date 2016/9/19.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public class RedisTest {
    private static final Log log = LogFactory.getLog(RedisTest.class);

    public static void main(String[] args) {

        Jedis jedis = new Jedis("192.168.56.23");

        String key = "lwh";
        String value = "";

        jedis.del(key); // 删数据

        jedis.set(key, "liwenhao"); // 存数据
        value = jedis.get(key); // 取数据
        log.info(key + "=" + value);

        jedis.set(key, "WuShuicheng2"); // 存数据
        value = jedis.get(key); // 取数据
        log.info(key + "=" + value);

        //jedis.del(key); // 删数据
        //value = jedis.get(key); // 取数据
        //log.info(key + "=" + value);
    }
}
