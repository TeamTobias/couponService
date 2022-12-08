package com.tobias.couponservice.inner.domain;

import com.tobias.couponservice.inner.domain.standardType.CouponItemStatus;
import com.tobias.couponservice.outer.dto.user.MyCouponDto;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*사용자 일련 번호*/
    @Column(nullable = false)
    private String userid;

    /*쿠폰 일련 번호*/
    @ManyToOne
    @JoinColumn(nullable = false)
    private Coupon coupon;


    /*쿠폰 사용 상태*/
    @Enumerated(EnumType.STRING)
    private CouponItemStatus status;


    public CouponItem(MyCouponDto myCouponDto, Coupon coupon, CouponItemStatus couponItemStatus) {
        this.userid = myCouponDto.getUserid();
        this.coupon = coupon;
        this.status = couponItemStatus;
    }

    public boolean isStatusEquals(CouponItemStatus enabled) {
        return this.status.equals(enabled);
    }

    public void useMyCoupon() {
        if (this.status.equals(CouponItemStatus.ENABLED)) {
            this.status = CouponItemStatus.USED;
        } else if(this.status.equals(CouponItemStatus.USED)) {
            throw new RuntimeException("이미 사용된 쿠폰입니다.");
        } else if(this.status.equals(CouponItemStatus.DISABLED)) {
            throw new RuntimeException("만료된 쿠폰입니다.");
        }
    }
}
