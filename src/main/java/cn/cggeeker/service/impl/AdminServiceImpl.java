package cn.cggeeker.service.impl;

import cn.cggeeker.mapper.AdminMapper;
import cn.cggeeker.pojo.Admin;
import cn.cggeeker.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/19/019
 * @Description:cn.cggeeker.service.impl
 * @version:1.0
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> findAllAdmin() {
        return adminMapper.findAllAdmin();
    }

    @Override
    public Admin adminLoginValidate(String adminName, String passWord) {
        return adminMapper.adminLoginValidate(adminName,passWord);
    }
}
