package cn.cggeeker.config;

import cn.cggeeker.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther:CG
 * @Date:2019/6/9/009
 * @Description:cn.cggeeker
 * @version:1.0
 */
@Configuration  /*配置类，坐等spring扫描*/
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) { //重写拦截器方法，设置拦截路径
        registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/**");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {  //设置默认首页

        registry.addViewController( "/" ).setViewName("forward:/login.html");

    }
}
