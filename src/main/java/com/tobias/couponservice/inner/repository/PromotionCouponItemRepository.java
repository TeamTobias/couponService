package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.aggregate.PromotionCouponItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromotionCouponItemRepository extends JpaRepository<PromotionCouponItem, Long> {
}
