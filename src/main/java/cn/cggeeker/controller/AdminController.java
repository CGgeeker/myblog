package cn.cggeeker.controller;

import cn.cggeeker.pojo.Admin;
import cn.cggeeker.service.AdminService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther:CG
 * @Date:2019/6/19/019
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Slf4j
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/findAllAdmin")
    public ResultJson findAllAdmin(){
        ResultJson resultJson = new ResultJson();
        List<Admin> adminList = adminService.findAllAdmin();
        if(!adminList.isEmpty()){
            resultJson.setStatus(200);
            resultJson.setMessage("查找所有管理员成功!");
            resultJson.setData(adminList);
        }else{
            resultJson.setStatus(500);
            resultJson.setMessage("管理员信息为空!");
        }
        return resultJson;
    }

}
