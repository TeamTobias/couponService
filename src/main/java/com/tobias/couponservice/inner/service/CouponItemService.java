package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.outer.dto.FindMyCouponDetailResponse;
import com.tobias.couponservice.outer.dto.SaveMyCouponRequest;

import java.util.List;

public interface CouponItemService {

    /*내 쿠폰 등록*/
    void saveMyCoupon(SaveMyCouponRequest myCouponDto);

    /*내 쿠폰 조회*/
    List<FindMyCouponDetailResponse> findMyCoupon(String userid);

    /*내 쿠폰 사용*/
    void useMyCoupon(String userid, long couponItemId);



}
