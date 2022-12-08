package com.tobias.couponservice.inner.service.Impl;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.CouponItem;
import com.tobias.couponservice.inner.domain.standardType.CouponItemStatus;
import com.tobias.couponservice.outer.dto.SaveMyCouponRequest;
import com.tobias.couponservice.outer.repository.CouponItemRepository;
import com.tobias.couponservice.inner.service.CouponItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CouponItemImpl implements CouponItemService {

    private final CouponItemRepository couponItemRepository;


    @Override
    public void saveMyCoupon(SaveMyCouponRequest saveMyCouponRequest) {
        Coupon coupon = new Coupon();
        coupon.getCoupon(saveMyCouponRequest.getCouponid());

        if (couponItemRepository.existsByUseridAndCoupon(saveMyCouponRequest.getUserid(), coupon))
            throw new RuntimeException("이미 등록된 쿠폰입니다.");
        else couponItemRepository.save(new CouponItem(saveMyCouponRequest, coupon, CouponItemStatus.ENABLED));
    }

    @Override
    public List<CouponItem> findMyCoupon(String userid) {
        return couponItemRepository.findByUseridAndStatus(userid, CouponItemStatus.ENABLED);
    }


    @Override
    public void useMyCoupon(String userid, Long couponItemId) {
        CouponItem couponItem = couponItemRepository.findByUseridAndCoupon(userid, Coupon.builder().id(couponItemId).build());
        couponItem.useMyCoupon();
        couponItemRepository.save(couponItem);

    }
}
