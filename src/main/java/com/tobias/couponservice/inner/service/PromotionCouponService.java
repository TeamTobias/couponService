package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.entity.Coupon;

import java.util.List;

/*
* @Description : 프로모션 쿠폰 서비스
* @Author : ImKunYoung
* */
public interface PromotionCouponService {

    /*프로모션 쿠폰 등록*/
    void registerPromotionCoupon(String managerId);

    /*프로모션 쿠폰 조회*/
    List<Coupon> findPromotionCoupon();

    /*프로모션 쿠폰 만료*/


}
