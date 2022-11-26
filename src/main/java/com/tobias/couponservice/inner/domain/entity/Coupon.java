package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.PermitStatus;
import com.tobias.couponservice.inner.domain.PublisherType;
import com.tobias.couponservice.inner.domain.Type;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    /*쿠폰 발행처*/
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private PublisherType publisherType;

    /*브랜드 일련 번호*/
    private String brandid;

    /*쿠폰 인가 상태*/
    @Enumerated(EnumType.STRING)
    private PermitStatus permitStatus;

    /*쿠폰 인가 직원 일련 번호*/
    private String managerid;

    /*쿠폰 내용*/
    @Column(nullable = false)
    private String content;

    /*쿠폰 타입*/
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Type tpye;

    /*쿠폰 적용 가능 금액*/
    @Column(nullable = false)
    private int leastAmount;

    /*쿠폰 시작일*/
    @Column(nullable = false)
    private Date startDate;

    /*쿠폰 종료일*/
    @Column(nullable = false)
    private Date endDate;

    /*쿠폰 생성일*/
    @CreatedDate
    private Date createdAt;



}
