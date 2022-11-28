package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.image.PixelGrabber;

public interface CouponRepository extends JpaRepository<Coupon, Long> {

    Coupon findCouponByOOrderByCreatedAt();
}
