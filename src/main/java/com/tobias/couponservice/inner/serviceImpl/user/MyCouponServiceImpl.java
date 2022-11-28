package com.tobias.couponservice.inner.serviceImpl.user;

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
public class MyCouponServiceImpl implements CouponItemService {

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

        return couponItemRepository.findByUseridAndStatus(userid, CouponItemStatus.ENABLED);

    }


    @Override
    public void useMyCoupon(String userid, Long couponItemId) {

        CouponItem couponItem = couponItemRepository.findByUseridAndCoupon(userid, Coupon.builder().id(couponItemId).build());

        if (couponItem.getStatus().equals(CouponItemStatus.ENABLED)) {
            couponItem.setStatus(CouponItemStatus.USED);
            couponItemRepository.save(couponItem);
        } else if(couponItem.getStatus().equals(CouponItemStatus.USED)) {
            log.info("이미 사용된 쿠폰입니다.");
        } else if(couponItem.getStatus().equals(CouponItemStatus.DISABLED)) {
            log.info("만료된 쿠폰입니다.");
        }

    }
}
