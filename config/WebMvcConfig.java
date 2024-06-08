package com.ajz.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Collin Ai
 * @version 1.0
 * @date 2024/6/1 08:51
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //设置允许跨域的路径
        registry.addMapping("/**")
                //设置允许跨域请求的域名
                //当**Credentials位true时，**Origin不能是星号，需为具体的ip地址[如果接口不带cookie，ip无需设置]
                .allowedOrigins("http://localhost:9627", "http://127.0.0.1:9527")
                //是否允许证书不再默认开启
                .allowCredentials(true)
                //设置允许的方法
                .allowedMethods("*")
                //跨域允许时间
                .maxAge(3600);
    }
}
