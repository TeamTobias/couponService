package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.entity.PromotionCouponItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionCouponItemRepository extends JpaRepository<PromotionCouponItem, Long> {
}
