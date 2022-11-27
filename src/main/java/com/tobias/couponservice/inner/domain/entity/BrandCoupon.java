package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.BrandCouponPermitStatus;
import com.tobias.couponservice.inner.domain.CouponType;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "brandcoupon")
public class BrandCoupon {

    /*브랜드 쿠폰 id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brandcouponid", nullable = false)
    private Long id;

    /*브랜드 id*/
    @Column(name = "brandid", nullable = false)
    private String brandId;

    /*쿠폰 인가 상태*/ /*TODO: - 설계도 도메인 모델 수정하기*/
    @Enumerated(EnumType.STRING)
    @Column(name = "brandcouponpermitstatus", nullable = false)
    private BrandCouponPermitStatus status;

    /*쿠폰 내용*/
    @Column(name = "description", nullable = false)
    private String description;

    /*쿠폰 타입*/
    @Enumerated(EnumType.STRING)
    @Column(name = "coupontype", nullable = false)
    private CouponType type;

    /*쿠폰 적용 가능 금액*/
    @Column(name = "applyamount", nullable = false)
    private Long leastPrice;

    /*쿠폰 시작일*/
    @Column(name = "opendate", nullable = false)
    private Date openDate;

    /*쿠폰 종료일*/
    @Column(name = "closedate", nullable = false)
    private Date closeDate;

    /*쿠폰 생성일*/
    @Column(name = "createdat")
    @CreatedDate
    private Date createdAt;

}
