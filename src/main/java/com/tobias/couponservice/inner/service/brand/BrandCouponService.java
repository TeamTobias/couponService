package com.tobias.couponservice.inner.service.brand;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.outer.dto.brand.RegisterdRequestDto;

import java.util.List;

/*
* @Description : 판매자 쿠폰 서비스
* @Author : ImKunYoung
* */
public interface BrandCouponService {

    /*판매자 쿠폰 등록 요청*/
    String registerBrandCouponRequest(RegisterdRequestDto registerdRequestDto);

    /*판매자 쿠폰 조회*/
    List<Coupon> findBrandCoupon(String brandId);

    /*판매자 쿠폰 만료*/

}
