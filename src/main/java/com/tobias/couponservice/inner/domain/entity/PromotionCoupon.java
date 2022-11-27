package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.CouponType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "promotioncoupon")
public class PromotionCoupon {
    /*쿠폰 id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promotioncouponid", nullable = false)
    private Long id;

    /*쿠폰 등록자 id*/
    @Column(name = "managerid", nullable = false)
    private Long managerid;

    /*쿠폰 내용*/
    @Column(name = "description", nullable = false)
    private String description;

    /*쿠폰 타입*/
    @Enumerated(EnumType.STRING)
    @Column(name = "coupontype", nullable = false)
    private CouponType couponType;

    /*쿠폰 적용 가능 금액*/
    @Column(name = "leastprice", nullable = false)
    private Long leastPrice;

    /*쿠폰 시작일*/
    @Column(name = "opendate", nullable = false)
    private Date openDate;

    /*쿠폰 종료일*/
    @Column(name = "closedate", nullable = false)
    private Date closeDate;

    /*쿠폰 생성일*/
    @Column(name = "createdat", nullable = false)
    @CreatedDate
    private Date createdAt;

}
