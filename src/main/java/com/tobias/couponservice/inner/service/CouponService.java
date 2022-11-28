package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.entity.Coupon;

import java.util.List;

public interface CouponService {

    /*프로모션 쿠폰 등록*/
    void registerPromotionCoupon(String managerId);

    /*프로모션 쿠폰 조회*/
    List<Coupon> findPromotionCoupon();

    /*프로모션 쿠폰 만료*/


}
