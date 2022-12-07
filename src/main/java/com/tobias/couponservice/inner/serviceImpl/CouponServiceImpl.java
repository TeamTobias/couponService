package com.tobias.couponservice.inner.serviceImpl;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.entity.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.entity.standardType.PublisherType;
import com.tobias.couponservice.inner.repository.CouponRepository;
import com.tobias.couponservice.inner.service.CouponService;
import com.tobias.couponservice.outer.dto.brand.BrandCouponRequest;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;



    /*브랜드 쿠폰*/
    @Override /*TODO- Publish Type 추가*/
    public void registerBrandCouponRequest(BrandCouponRequest registerdRequestDto) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        
        Coupon coupon = modelMapper.map(registerdRequestDto, Coupon.class);
        coupon.setPermitStatus(PermitStatus.REQUESTED);
        couponRepository.save(coupon);

    }

    @Override
    public List<Coupon> findBrandCoupon(String brandId) {
        return couponRepository.findByBrandidAndPublisherType(brandId, PublisherType.BRAND);
    }


    @Override
    public void promotionCouponRequest(String managerId) {
    }

    @Override
    public List<Coupon> findPromotionCoupon() {
        return null;
    }


}
