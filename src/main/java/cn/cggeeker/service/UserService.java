package cn.cggeeker.service;

import cn.cggeeker.pojo.User;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.service
 * @version:1.0
 */
public interface UserService {
    public User userLoginValidate(String userName,String passWord);
}
