package com.magneto.his.controller.LoginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    private static final List<String> EXCLUDE_PATH= Arrays.asList("/emp/login","/pages/index");

    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 重写添加拦截器方法并添加配置拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册登录拦截器
        InterceptorRegistration loginRegistry = registry.addInterceptor(loginInterceptor);
        //拦截全部请求
        loginRegistry.addPathPatterns("/**");
        //不拦截以下请求
        loginRegistry.excludePathPatterns("/pages/index");
        loginRegistry.excludePathPatterns("/emp/login");
        loginRegistry.excludePathPatterns("/css/**");
        loginRegistry.excludePathPatterns("/js/**");
        loginRegistry.excludePathPatterns("/img/**");

    }


    /*
     *最重要的一步：在此处指明你在拦截器中排除拦截的静态资源路径指向的是classpath下static路径
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

}
