package cn.cggeeker.service;

import cn.cggeeker.pojo.Admin;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/19/019
 * @Description:cn.cggeeker.service
 * @version:1.0
 */
public interface AdminService {

    public List<Admin> findAllAdmin();

    public Admin adminLoginValidate(String adminName,String passWord);

}
