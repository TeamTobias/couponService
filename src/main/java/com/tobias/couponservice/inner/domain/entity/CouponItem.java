package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.entity.standardType.CouponItemStatus;
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

}
