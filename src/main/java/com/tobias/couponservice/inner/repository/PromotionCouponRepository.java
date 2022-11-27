package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.entity.BrandCoupon;
import com.tobias.couponservice.inner.domain.entity.PromotionCoupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionCouponRepository extends JpaRepository<PromotionCoupon, Long> {
}
