package com.amkhinini.interceptors.config;

import com.amkhinini.interceptors.interceptors.GlobalInterceptor;
import com.amkhinini.interceptors.interceptors.SpecificInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorsConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // .order is optionnal
        registry.addInterceptor(new GlobalInterceptor()).order(1);
        registry.addInterceptor(new SpecificInterceptor()).addPathPatterns("/products/**").order(2);
    }
}
