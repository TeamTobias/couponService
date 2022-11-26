package com.tobias.couponservice.inner.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;

import java.util.List;

@SpringBootTest
@Profile("dev")
public class PromotionCouponServiceTests {

     private PromotionCouponService promotionCouponService;


     /*프로모션 쿠폰 등록*/
     @Test
     @Description("프로모션 쿠폰 등록")
     private void registerPromotionCoupon() {


     }

     /*프로모션 쿠폰 조회*/
     @Test
     @Description("프로모션 쿠폰 등록")
     private void findPromotionCoupon() {

     }

}
