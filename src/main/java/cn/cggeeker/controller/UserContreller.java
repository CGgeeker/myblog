package cn.cggeeker.controller;

import cn.cggeeker.pojo.Admin;
import cn.cggeeker.pojo.InviteCode;
import cn.cggeeker.pojo.User;
import cn.cggeeker.service.AdminService;
import cn.cggeeker.service.UserService;
import cn.cggeeker.util.CurrentTime;
import cn.cggeeker.util.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther:CG
 * @Date:2019/6/10/010
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Controller
@Slf4j
@RequestMapping("/user")
public class UserContreller {  // 用户控制器
    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;


    @GetMapping("/userLoginValidate")  //用户登录验证
    @ResponseBody
    public ResultJson userLoginValidate(String userName,String passWord,HttpServletRequest request,HttpServletResponse response){
        ResultJson resultJson = new ResultJson();
        User user = userService.userLoginValidate(userName,passWord);
        Admin admin = adminService.adminLoginValidate(userName,passWord);
        if(user!=null){  //用户登录成功
            resultJson.setStatus(200);
            resultJson.setMessage("登录成功！");
            resultJson.setData(user);
            //登录成功后将用户名和userid存入session中
            String loginname = user.getUserName();
            int loginid = user.getUserId();
            request.getSession().setAttribute("userObject",user);

            request.getSession().setAttribute("adminObject",admin);

        }else if(admin!=null){  //管理员登录成功
            resultJson.setStatus(201);
            resultJson.setMessage("登录成功！");
            resultJson.setData(admin);
            //登录成功后将用户名和userid存入session中
            String loginname = admin.getAdminName();
            int loginid = admin.getAdminId();
            request.getSession().setAttribute("adminObject",admin);

            request.getSession().setAttribute("userObject",user);

        } else {
            resultJson.setStatus(500);
            resultJson.setMessage("用户名或密码错误！");
        }
        return resultJson;
    }

    @PostMapping("/insertUser")  //用户注册
    @ResponseBody
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
    @ResponseBody
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

    @RequestMapping("/test1")
    public void test1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           request.getRequestDispatcher("/index.html").forward(request, response);
        /*response.sendRedirect("/index.html");*/
    }

    @GetMapping("/getLoginUserSession")
    @ResponseBody                       //获取已经登录（或者称之为在线）的用户（管理员）信息
    public ResultJson getLoginUserSession(HttpServletRequest request , HttpServletResponse response){
        ResultJson resultJson = new ResultJson();
        Map<String,Object> map = new HashMap<>();
        User user = (User)request.getSession().getAttribute("userObject");
        Admin admin = (Admin)request.getSession().getAttribute("adminObject");
        log.debug(":::::::::::::::::::Session--user::::::::::::::" + user);
        log.debug(":::::::::::::::::::Session--admin::::::::::::::" + admin);
        if((user!=null)||(admin!=null)){
            map.put("userObject",user);
            map.put("adminObject",admin);
            resultJson.setStatus(200);
            resultJson.setMessage("成功获取当前用户的session信息！");
            resultJson.setData(map);
        }
        else{
            resultJson.setStatus(500);
            resultJson.setMessage("获取当前用户session失败");
        }
        return resultJson;
    }







}
