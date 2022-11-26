package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.entity.BrandCouponItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandCouponItemRepository extends JpaRepository<BrandCouponItem, Long> {
}
