package com.example.maps.tools;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author wj
 * @version 1.0
 * @className LocalResourcesHandlers
 * @description 本地资源映射
 * @date 2019/9/4 8:57
 */
@Configuration
public class LocalResourcesHandlers implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/js/tiles/**").addResourceLocations("file:D:/tiles/");
    }
}
