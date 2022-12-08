package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.outer.dto.brand.BrandCouponRequest;

import java.util.List;

public interface CouponService {

    public void brandCouponRequest(BrandCouponRequest brandCouponRequest);

    public List<Coupon> findBrandCoupon(String brandId);

    public void promotionCouponRequest(PromotionCouponRequest promotionCouponRequest);

    public void brandCouponPermit(long couponid, long managerid);

    public List<BrandCouponRequestRes> findBrandCouponRequest();

    public List<FindCouponRes> findCoupon();

}
