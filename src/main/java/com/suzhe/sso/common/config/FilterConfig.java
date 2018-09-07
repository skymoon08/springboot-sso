
package com.suzhe.sso.common.config;

import com.suzhe.sso.common.web.CorsFilter;
import com.suzhe.sso.common.web.WebContextFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Filter配置
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean webContextFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new WebContextFilter());
        registration.addUrlPatterns("/*"); //
        registration.setName("webContextFilter");
        registration.setOrder(2);//设置顺序 数字越小，优先级越高
        return registration;
    }


    @Bean
    public FilterRegistrationBean corsFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new CorsFilter());
        registration.addUrlPatterns("/*"); //
        registration.setName("corsFilter");
        registration.setOrder(1);//设置顺序 数字越小，优先级越高
        return registration;
    }


}
