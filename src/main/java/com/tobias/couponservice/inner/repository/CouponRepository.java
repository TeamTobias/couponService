package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.entity.standardType.PublisherType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findCouponByOrderByCreatedAt();

    List<Coupon> findByBrandidAndPublisherType(String brandId, PublisherType publisherType);

}
