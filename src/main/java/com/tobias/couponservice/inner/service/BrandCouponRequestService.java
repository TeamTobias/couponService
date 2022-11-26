package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.entity.Coupon;

import java.util.List;

/*
* @Description : 판매자 쿠폰 등록 요청 처리
* @Author : ImKunYoung
* */
public interface BrandCouponRequestService {

    /*판매자 쿠폰 등록 요청 조회 */
    List<Coupon> findBrandCouponRequest();

    /*판매자 쿠폰 등록 요청 처리*/
    void processBrandCouponRequest(String permitStatus, Long couponId);

}
