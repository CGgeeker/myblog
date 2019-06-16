package cn.cggeeker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther:CG
 * @Date:2019/6/13/013
 * @Description:cn.cggeeker.controller
 * @version:1.0
 */
@Controller
public class ForwardController {  // 请求转发控制器

    @RequestMapping("/testIndex")
    public void testIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/index.html").forward(request, response);
        /*response.sendRedirect("/index.html");*/
    }


    @RequestMapping("/testEditor")
    public void testEditor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/editor.html").forward(request, response);
        /*response.sendRedirect("/index.html");*/
    }
}
