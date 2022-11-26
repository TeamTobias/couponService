package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.aggregate.BrandCouponItem;
import com.tobias.couponservice.inner.domain.entity.BrandCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandCouponRepository extends JpaRepository<BrandCoupon, Long> {
}
