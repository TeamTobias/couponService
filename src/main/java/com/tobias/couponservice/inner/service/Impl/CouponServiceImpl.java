package com.tobias.couponservice.inner.service.Impl;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.outer.dto.*;
import com.tobias.couponservice.outer.repository.CouponRepository;
import com.tobias.couponservice.inner.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;

    public void brandCouponRequest(BrandCouponRequest brandCouponRequest) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);

        Coupon coupon = modelMapper.map(brandCouponRequest, Coupon.class);
        coupon.setPermitStatus(PermitStatus.REQUESTED);
        couponRepository.save(coupon);
    }

    @Override
    public List<FindCouponRes> findBrandCoupon(long brandId) {
        List<Coupon> coupons= couponRepository.findByPublisherVo_BrandidAndPublisherVo_PublisherType(brandId, PublisherType.BRAND);
        return coupons.stream().map(FindCouponRes::new).collect(Collectors.toList());
    }


    @Override
    public void promotionCouponRequest(PromotionCouponRequest promotionCouponRequest) {
        ModelMapper modelMapper = new ModelMapper();
        Coupon coupon = modelMapper.map(promotionCouponRequest, Coupon.class);

        coupon.setPermitStatus(PermitStatus.PERMIT);
        couponRepository.save(coupon);
    }

    @Override
    public void brandCouponPermit(long couponid, long managerid) {
        Optional<Coupon> coupon = couponRepository.findById(couponid);
        coupon.ifPresent(coupon1 -> {
            coupon1.setPermitStatus(PermitStatus.PERMIT);
            coupon1.setManagerid(managerid);
            couponRepository.save(coupon1);
        });
    }

    @Override
    public List<BrandCouponRequestRes> findBrandCouponRequest() {
        List<Coupon> coupons = couponRepository.findByPublisherVo_PermitStatus(PermitStatus.REQUESTED);
        return coupons.stream().map(BrandCouponRequestRes::new).collect(Collectors.toList());
    }

    @Override
    public List<FindCouponRes> findCoupon() {
        List<Coupon> coupons = couponRepository.findEnableCoupon();
        return coupons.stream().map(FindCouponRes::new).collect(Collectors.toList());
    }




}
