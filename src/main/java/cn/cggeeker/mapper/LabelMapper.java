package cn.cggeeker.mapper;

import cn.cggeeker.pojo.Label;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/14/014
 * @Description:cn.cggeeker.mapper
 * @version:1.0
 */
@Repository
public interface LabelMapper extends Mapper<Label> {  /*继承通用Mapper，实现对数据表的基本CRUD*/

    public List<Label> findAllLabel();  //查找所有标签

}
