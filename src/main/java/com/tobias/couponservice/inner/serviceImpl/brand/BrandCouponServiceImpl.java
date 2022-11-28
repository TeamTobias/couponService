package com.tobias.couponservice.inner.serviceImpl.brand;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.entity.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.entity.standardType.PublisherType;
import com.tobias.couponservice.inner.repository.CouponRepository;
import com.tobias.couponservice.inner.service.CouponService;
import com.tobias.couponservice.outer.dto.brand.RegisterdRequestDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandCouponServiceImpl implements CouponService {

    private final CouponRepository couponRepository;

    @Override /*TODO- Publish Type 추가*/
    public String registerBrandCouponRequest(RegisterdRequestDto registerdRequestDto) {

        // RegisterdRequestDto을 Coupon으로 매핑
        ModelMapper modelMapper = new ModelMapper();

        // 느슨한 매핑
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        Coupon coupon = modelMapper.map(registerdRequestDto, Coupon.class);

        // Coupon.setPermitSatus(PermitStatus.REQUESTED)
        coupon.setPermitStatus(PermitStatus.REQUESTED);

        couponRepository.save(coupon);

        System.out.println(couponRepository.findAll());

        return "success"; /*TODO: -품격 있게 수정*/
    }


    @Override
    public List<Coupon> findBrandCoupon(String brandId) {
        return couponRepository.findByBrandidAndPublisherType(brandId, PublisherType.BRAND);
    }


}


