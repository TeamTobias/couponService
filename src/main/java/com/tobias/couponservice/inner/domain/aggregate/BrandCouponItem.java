package com.tobias.couponservice.inner.domain.aggregate;

import com.tobias.couponservice.inner.domain.CouponStatus;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "brandcouponitem")
public class BrandCouponItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brandcouponitemid", nullable = false)
    private Long id;

    @ManyToOne
    private MyCoupon myCoupon;

    @Enumerated(EnumType.STRING)
    private CouponStatus status;

}