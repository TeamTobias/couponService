package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.aggregate.CouponItem;
import com.tobias.couponservice.inner.domain.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CouponItemRepository extends JpaRepository<CouponItem, Coupon> {

    /*내 쿠폰 조회*/
    Iterable<CouponItem> findByUserid(String userid);


}
