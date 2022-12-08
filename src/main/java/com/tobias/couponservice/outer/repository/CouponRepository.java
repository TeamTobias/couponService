package com.tobias.couponservice.outer.repository;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findCouponByOrderByCreatedAt();

    List<Coupon> findByBrandidAndPublisherType(String brandId, PublisherType publisherType);

}