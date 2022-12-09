package com.tobias.couponservice.outer.repository;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CouponRepository extends JpaRepository<Coupon, Long> {


    Iterable<Coupon> findByPublisherVo_BrandidAndPublisherVo_PublisherType(long brandId, PublisherType publisherType);

    List<Coupon> findByPublisherVo_PermitStatus(PermitStatus requested);


    @Query("select coupon from Coupon coupon where coupon.publisherVo.permitStatus = 'PERMIT' and coupon.conditionVo.openDate <= current_date and coupon.conditionVo.endDate >= current_date")
    List<Coupon> findEnableCoupon();

}
