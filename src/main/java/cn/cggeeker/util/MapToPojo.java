package cn.cggeeker.util;

import com.alibaba.fastjson.JSON;

import java.util.Map;

/**
 * @Auther:CG
 * @Date:2020/1/20/020 8:50
 * @Classname cn.cggeeker.util
 * @Description: TODO
 * @version:1.0
 */
public  class MapToPojo {

    /**
     *@Description TODO自定义方法传入Map和类的字节码将Map数据转为指定的实体类
     *@param map
     *@param c
     *@return T
     *@auther CG
     *@date
     */
    public static <T> T mapToEntity(Map<String,Object> map, Class<T> c){
        T t = JSON.parseObject(JSON.toJSONString(map), c);
        return t;
    }

}
