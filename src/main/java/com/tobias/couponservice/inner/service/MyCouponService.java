package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.aggregate.CouponItem;
import com.tobias.couponservice.outer.dto.MyCouponDto;

import java.util.List;

/*
* @Description : 사용자 쿠폰 서비스
* @Author : ImKunYoung
* */
public interface MyCouponService {

    /*내 쿠폰 등록*/
    void saveMyCoupon(MyCouponDto myCouponDto);

    /*내 쿠폰 조회*/
    List<CouponItem> findMyCoupon(String userid);

    /*내 쿠폰 사용*/
    void useMyCoupon(String userid, Long couponItemId);

}
