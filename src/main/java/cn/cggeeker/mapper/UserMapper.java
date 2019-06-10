package cn.cggeeker.mapper;

import cn.cggeeker.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.mapper
 * @version:1.0
 */
/*继承通用Mapper，实现对数据表的基本CRUD*/
@Repository
public interface UserMapper extends Mapper<User> {
   public User userLoginValidate(@Param(value = "userName")String userName,@Param(value = "passWord")String passWord); //用户登录验证
}
