package com.tobias.couponservice.inner.serviceImpl;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.entity.CouponItem;
import com.tobias.couponservice.inner.domain.standardType.CouponItemStatus;
import com.tobias.couponservice.inner.repository.CouponItemRepository;
import com.tobias.couponservice.inner.service.MyCouponService;
import com.tobias.couponservice.outer.dto.MyCouponDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MyCouponServiceImpl implements MyCouponService {

    private final CouponItemRepository couponItemRepository;


    @Override
    public void saveMyCoupon(MyCouponDto myCouponDto) {

        Coupon coupon = Coupon.builder()
                .id(myCouponDto.getCouponid())
                .build();

        if (couponItemRepository.existsByUseridAndCoupon(myCouponDto.getUserid(), coupon))
            log.info("이미 저장된 쿠폰입니다.");
        else couponItemRepository.save(CouponItem.builder()
                .userid("1")
                .coupon(coupon)
                .status(CouponItemStatus.ENABLED)
                .build());
    }


    @Override
    public List<CouponItem> findMyCoupon(String userid) {
        return (List<CouponItem>) couponItemRepository.findByUserid(userid);
    }


    @Override
    public void useMyCoupon(String userid, Long couponItemId) {


    }
}
