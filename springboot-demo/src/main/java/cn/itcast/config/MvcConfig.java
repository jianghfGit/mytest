package cn.itcast.config;

import cn.itcast.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 注册拦截器进入本项目中
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer{

    /**
     * 通过@Bean注解，将我们定义的拦截器注入到Spring容器中
     * @return
     */
    /*@Bean
    public MyInterceptor loginInterceptor(){
        return new MyInterceptor();
    }*/

    /**
     * 通过重写WebMvcConfigurer接口的addInterceptor()方法，添加自定义拦截器
     * @param registry
     */
    public void addInterceptors(InterceptorRegistry registry){
        //通过registry.addInterceptor()注册拦截器到该项目中，通过addPathPatterns()来添加拦截路径
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
    }
}
