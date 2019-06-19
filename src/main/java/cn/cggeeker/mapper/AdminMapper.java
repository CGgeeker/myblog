package cn.cggeeker.mapper;

import cn.cggeeker.pojo.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/19/019
 * @Description:cn.cggeeker.mapper
 * @version:1.0
 */
@Repository
public interface AdminMapper {

    public List<Admin> findAllAdmin();  //查找所有管理员(博主)信息

}
