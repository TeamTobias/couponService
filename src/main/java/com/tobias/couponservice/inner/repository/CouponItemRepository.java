package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.aggregate.CouponItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponItemRepository extends JpaRepository<CouponItem, Long> {
}
