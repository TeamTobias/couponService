package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.entity.CouponItem;
import com.tobias.couponservice.inner.domain.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponItemRepository extends JpaRepository<CouponItem, Long> {

    /*내 쿠폰 조회*/
    Iterable<CouponItem> findByUserid(String userid);


    /*userid & couponid 존재 여부*/
    boolean existsByUseridAndCoupon(String userid, Coupon coupon);

    CouponItem findByUseridWithCoupon(String userid, Coupon coupon);
}
