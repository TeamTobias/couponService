package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.entity.CouponItem;
import com.tobias.couponservice.outer.dto.user.MyCouponDto;

import java.util.List;

public interface CouponItemService {

    /*내 쿠폰 등록*/
    void saveMyCoupon(MyCouponDto myCouponDto);

    /*내 쿠폰 조회*/
    List<CouponItem> findMyCoupon(String userid);

    /*내 쿠폰 사용*/
    void useMyCoupon(String userid, Long couponItemId);






}
