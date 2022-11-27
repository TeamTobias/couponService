package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.aggregate.MyCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyCouponRepository extends JpaRepository<MyCoupon, Long> {
}
