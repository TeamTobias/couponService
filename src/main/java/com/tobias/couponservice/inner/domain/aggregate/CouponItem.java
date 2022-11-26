package com.tobias.couponservice.inner.domain.aggregate;

import com.tobias.couponservice.inner.domain.CouponItemStatus;
import com.tobias.couponservice.inner.domain.entity.Coupon;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CouponItem {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
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
