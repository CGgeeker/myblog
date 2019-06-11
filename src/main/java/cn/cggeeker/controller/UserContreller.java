package cn.cggeeker.controller;

import cn.cggeeker.pojo.InviteCode;
import cn.cggeeker.pojo.User;
import cn.cggeeker.service.UserService;
import cn.cggeeker.util.CurrentTime;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

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

    @GetMapping("/userLoginValidate")  //用户登录验证
    public ResultJson userLoginValidate(String userName,String passWord){
        ResultJson resultJson = new ResultJson();
        User user = userService.userLoginValidate(userName,passWord);
        if(user!=null){
            resultJson.setStatus(200);
            resultJson.setMessage("登录成功！");
            resultJson.setData(user);
        }else {
            resultJson.setStatus(500);
            resultJson.setMessage("用户名或密码错误！");
        }
        return resultJson;
    }

    @PostMapping("/insertUser")  //用户注册
    public ResultJson insertUser(User user){
        CurrentTime currentTime = new CurrentTime();
        ResultJson resultJson = new ResultJson();
        log.debug("::::::::::::::::::::::::::-----------用户名："+user.getUserName());
        int result1 = userService.findUserByName(user.getUserName());
        if(result1==0){   //此判断验证用户名是否存在 0：不存在
            InviteCode result2 = userService.findInviteCodeByName(user.getInviteCode());
            if(result2!=null){  //判断邀请码是否存在
                user.setRegisterTime(new Timestamp(currentTime.getWebsiteDatetime()));
                int result3 = userService.insertUser(user);
                if(result3>0){
                    resultJson.setStatus(200);
                    resultJson.setMessage("注册成功！");
                }else{
                    resultJson.setStatus(500);
                    resultJson.setMessage("注册失败！");
                }
            }
            else{
                resultJson.setStatus(501);
                resultJson.setMessage("邀请码错误，注册失败！");
            }
        }
        else{
            resultJson.setStatus(500);
            resultJson.setMessage("用户名已存在，换一个吧！");
        }
        return resultJson;
    }

    @PostMapping("/modifyUserPassword")
    public ResultJson modifyUserPassword(User user){
        ResultJson resultJson = new ResultJson();
        int affectRow = userService.modifyUserPassword(user);
        if(affectRow>0){
            resultJson.setStatus(200);
            resultJson.setMessage("重置密码成功！");
        }
        else {
            resultJson.setStatus(500);
            resultJson.setMessage("用户名不存在或邀请码错误！");
        }
        return resultJson;
    }





}
