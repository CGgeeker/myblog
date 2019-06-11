package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.UserMapper;
import cn.cggeeker.pojo.InviteCode;
import cn.cggeeker.pojo.User;
import cn.cggeeker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.service.impl
 * @version:1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public User userLoginValidate(String userName, String passWord) {
        return userMapper.userLoginValidate(userName,passWord);
    }

    @Override
    public int findUserByName(String userName) {
        return userMapper.findUserByName(userName);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public InviteCode findInviteCodeByName(String inviteCode) {
        return userMapper.findInviteCodeByName(inviteCode);
    }

    @Override
    public int modifyUserPassword(User user) {
        return userMapper.modifyUserPassword(user);
    }
}
