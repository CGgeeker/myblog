package cn.cggeeker.config;

import cn.cggeeker.interceptor.RequestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
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
        registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/**") //注意这里有坑，路径不能写成 / 必须写成 /**
                .excludePathPatterns("/login.html","/public/**");  //静态资源放行
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/public/**").addResourceLocations("classpath:/public/");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {  //设置默认首页

//        registry.addViewController( "/" ).setViewName("login");

    }
}
