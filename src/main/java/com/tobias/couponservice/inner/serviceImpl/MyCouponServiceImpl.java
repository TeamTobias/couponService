package com.tobias.couponservice.inner.serviceImpl;

import com.tobias.couponservice.inner.domain.aggregate.CouponItem;
import com.tobias.couponservice.inner.repository.CouponItemRepository;
import com.tobias.couponservice.inner.service.MyCouponService;
import com.tobias.couponservice.outer.dto.MyCouponDto;

import java.util.List;

public class MyCouponServiceImpl implements MyCouponService {

    private CouponItemRepository couponItemRepository;



    @Override
    public void saveMyCoupon(MyCouponDto myCouponDto) {


    }



    @Override
    public List<CouponItem> findMyCoupon(String userid) {

        return (List<CouponItem>) couponItemRepository.findByUserid(userid);
    }


    @Override
    public void useMyCoupon(String userid, Long couponItemId) {

    }
}
