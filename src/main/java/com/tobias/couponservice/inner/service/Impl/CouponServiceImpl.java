package com.tobias.couponservice.inner.service.Impl;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.outer.dto.BrandCouponRequest;
import com.tobias.couponservice.outer.dto.BrandCouponRequestRes;
import com.tobias.couponservice.outer.dto.FindCouponRes;
import com.tobias.couponservice.outer.dto.PromotionCouponRequest;
import com.tobias.couponservice.outer.repository.CouponRepository;
import com.tobias.couponservice.inner.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Coupon> findBrandCoupon(String brandId) {
        return couponRepository.findByBrandidAndPublisherType(brandId, PublisherType.BRAND);
    }

    @Override
    public void promotionCouponRequest(PromotionCouponRequest promotionCouponRequest) {

    }

    @Override
    public void brandCouponPermit(long couponid, long managerid) {

    }

    @Override
    public List<BrandCouponRequestRes> findBrandCouponRequest() {

        return null;
    }

    @Override
    public List<FindCouponRes> findCoupon() {
        return null;
    }




}
