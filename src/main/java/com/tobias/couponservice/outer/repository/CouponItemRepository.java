package com.tobias.couponservice.outer.repository;

import com.tobias.couponservice.inner.domain.CouponItem;
import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.standardType.CouponItemStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CouponItemRepository extends JpaRepository<CouponItem, Long> {


    /*userid & couponid 존재 여부*/
    boolean existsByUseridAndCoupon(String userid, Coupon coupon);

    CouponItem findByUseridAndCoupon(String userid, Coupon coupon);

    /* CouponItemStatus.ENABLE인 쿠폰 조회*/
    List<CouponItem> findByUseridAndStatus(String userid, CouponItemStatus status);


}
