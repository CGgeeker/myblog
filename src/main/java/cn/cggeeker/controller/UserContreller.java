package cn.cggeeker.controller;

import cn.cggeeker.pojo.User;
import cn.cggeeker.service.UserService;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserContreller {
    @Autowired
    private UserService userService;

    @RequestMapping("/userLoginValidate")
    public ResultJson userLoginValidate(String userName,String passWord){
        ResultJson resultJson = new ResultJson();
        User user = userService.userLoginValidate(userName,passWord);
        if(user!=null){
            resultJson.setStatus(200);
            resultJson.setMsg("登录成功！");
            resultJson.setData(user);
        }else {
            resultJson.setStatus(500);
            resultJson.setMsg("用户名或密码错误！");
        }
        return resultJson;
    }



}
