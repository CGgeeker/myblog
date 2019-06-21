package cn.cggeeker.redisdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @Auther:CG
 * @Date:2019/6/21/021
 * @Description:cn.cggeeker.redisdao
 * @version:1.0
 */

/*
    通过RedisTemplate访问Redis
    注入StringRedisTemplate的Bean来对Redis数据库中的字符串类型的数据进行操作
 */
@Repository //将类注入Spring IoC容器中
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    //向Redis设置String类型的数据
    public void setKey(String key,String value){
        ValueOperations<String,String> ops = template.opsForValue();
        ops.set(key,value,1, TimeUnit.MINUTES);//1分钟过期
    }

    //从Redis中读取String类型的数据
    public String getValue(String key){
        ValueOperations<String,String> ops = this.template.opsForValue();
        return  ops.get(key);
    }

}
