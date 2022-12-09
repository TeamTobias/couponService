package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.outer.dto.BrandCouponRequest;
import com.tobias.couponservice.outer.dto.*;

import java.util.List;

public interface CouponService {

    void brandCouponRequest(BrandCouponRequest brandCouponRequest);

    List<FindCouponRes> findBrandCoupon(long brandId);

    void promotionCouponRequest(PromotionCouponRequest promotionCouponRequest);

    void brandCouponPermit(long couponid, long managerid);

    List<BrandCouponRequestRes> findBrandCouponRequest();

    List<FindCouponRes> findCoupon();

}
