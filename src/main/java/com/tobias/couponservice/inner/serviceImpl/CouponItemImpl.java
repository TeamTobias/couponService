package com.tobias.couponservice.inner.serviceImpl;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.entity.CouponItem;
import com.tobias.couponservice.inner.domain.entity.standardType.CouponItemStatus;
import com.tobias.couponservice.inner.repository.CouponItemRepository;
import com.tobias.couponservice.inner.service.CouponItemService;
import com.tobias.couponservice.outer.dto.user.MyCouponDto;
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
    public void saveMyCoupon(MyCouponDto myCouponDto) {
        Coupon coupon = new Coupon();
        coupon.setId(myCouponDto);

        if (couponItemRepository.existsByUseridAndCoupon(myCouponDto.getUserid(), coupon))
             throw new RuntimeException("이미 등록된 쿠폰입니다.");
        else couponItemRepository.save(new CouponItem(myCouponDto, coupon, CouponItemStatus.ENABLED));
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
