package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.outer.dto.brand.BrandCouponRequest;

import java.util.List;

public interface CouponService {

    /*프로모션 쿠폰 등록*/
    void promotionCouponRequest(String managerId);

    /*프로모션 쿠폰 조회*/
    List<Coupon> findPromotionCoupon();

    /*프로모션 쿠폰 만료*/






    /*판매자 쿠폰 등록 요청*/
    void registerBrandCouponRequest(BrandCouponRequest registerdRequestDto);

    /*판매자 쿠폰 조회*/
    List<Coupon> findBrandCoupon(String brandId);

    /*판매자 쿠폰 만료*/


}
