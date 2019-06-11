package cn.cggeeker.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther:CG
 * @Date:2019/6/6/006
 * @Description:com.itlike.interceptor
 * @version:1.0
 */
@Slf4j
public class RequestInterceptor implements HandlerInterceptor {
    /*private static final Logger log = LoggerFactory.getLogger(MyInterceptor.class); */ //加入Lombok的@Slf4j注解省略此句，但是我的失效了

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("RequestInterceptor----------preHandle拦 - 截 - 器 - 处 - 理 - 中........");
        //首页路径以及登录放行
        if ("/index".equals(request.getRequestURI()) || "/login.html".equals(request.getRequestURI())) {
            return true;
        }
        //重定向
     /*   Object object = request.getSession().getAttribute("user");
        if (null == object) {
            response.sendRedirect("/login.html");
            return false;
        }*/
        return true;

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
