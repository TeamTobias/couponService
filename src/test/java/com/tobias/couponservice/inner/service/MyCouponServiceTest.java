package com.tobias.couponservice.inner.service;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Profile("test")
@SpringBootTest
public class MyCouponServiceTest {


    @BeforeAll
    public static void beforeAll() {
        System.setProperty("spring.profiles.active", "test");
    }

    @Autowired
    private Environment environment;

    @Autowired
    private MyCouponRepository myCouponRepository;

//    @Autowired
//    private PromotionCoupon promotionCoupon;
//
//    @Autowired
//    private PromotionCoupon promotionCoupon;

    @Test
    @Description("프로파일 확인")
    public void testProfile() {
        Arrays.stream(environment.getActiveProfiles()).forEach(System.out::println);
    }

    @Test
    @Description("1. 내 쿠폰 등록 테스트")
    public void registerCoupon() {


        System.out.println(myCouponRepository.findAll());

    }






}
