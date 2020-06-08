package com.jtt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//public class CorsConfig {
//    private CorsConfiguration buildConfig(){
//        //需要返回一个对象
//        CorsConfiguration corsConfiguration=new CorsConfiguration();
//        //  你需要跨域的地址  注意这里的 127.0.0.1 != localhost
//        // * 表示对所有的地址都可以访问
//        corsConfiguration.addAllowedOrigin("*");
//        //  跨域的请求头
//        corsConfiguration.addAllowedHeader("*");
//        //  跨域的请求方法
//        corsConfiguration.addAllowedMethod("*");
//        //加上了这一句，大致意思是可以携带 cookie
//        //最终的结果是可以 在跨域请求的时候获取同一个 session
//        corsConfiguration.setAllowCredentials(true);
//        return corsConfiguration;
//    }
//    //配置类@Configuration的时候，必须给某一个方法加上@Bean的注解
//    @Bean
//    public CorsFilter corsFilter(){
//        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
//        //配置 可以访问的地址--配置路径，配置类
//        source.registerCorsConfiguration("/**",buildConfig());
//        return new CorsFilter(source);
//    }
//
//}
