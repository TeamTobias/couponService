package com.tobias.couponservice.outer.web.config;


/*
*
* @Description : Swagger2 설정
* @Author : ImKunYoung
*
*/

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info = @Info(title = "쿠폰서비스 API 명세서",
        description = "헥사고날 아키텍처 기반 쿠폰서비스 API 명세서",
        version = "v1"))
@Configuration
public class Swagger2Config {


    @Bean
    public GroupedOpenApi publicApi() {
        String[] paths = {"/myCoupon/v1/**", "/promotionCoupon/v1/**", "/brandCoupon/v1/**", "/coupon/v1/**"};

        return GroupedOpenApi.builder()
                .group("쿠폰서비스 API v1")
                .pathsToMatch(paths)
                .build();
    }




}
