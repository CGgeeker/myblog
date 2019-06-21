package cn.cggeeker.controller;

import cn.cggeeker.util.ResultJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Auther:CG
 * @Date:2019/6/21/021
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@RestController
@RequestMapping("/online")
public class OnlineCountController {

    @GetMapping("/getOnlineCount")
    public int getOnlineCount(HttpServletRequest httpServletRequest){
        HttpSession session = httpServletRequest.getSession();
        //将session监听器的统计在线人数给拿出来~
        Object onlineCount=session.getServletContext().getAttribute("onlineCount");
        int count = (int)onlineCount;

        //展示一下，看看
        return count;

    }

}
