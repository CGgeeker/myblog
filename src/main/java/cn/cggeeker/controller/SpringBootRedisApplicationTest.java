package cn.cggeeker.controller;

import cn.cggeeker.redisdao.RedisDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Auther:CG
 * @Date:2019/6/21/021
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */

//SpringBoot测试必须加以下两个注解
@RunWith(SpringRunner.class) //不添加，所有注解会被忽略
@SpringBootTest
@Slf4j
public class SpringBootRedisApplicationTest {

    //日志文件打印

    @Autowired
    RedisDao redisDao;

    @Test
    public void testRedis(){
        redisDao.setKey("name","tl");
        redisDao.setKey("age","18");
        log.debug(redisDao.getValue("name"));
        log.debug(redisDao.getValue("age"));
    }

}