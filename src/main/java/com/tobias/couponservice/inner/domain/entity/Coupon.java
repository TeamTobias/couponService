package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coupon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*쿠폰 발행처*/
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
    private String content;

    /*쿠폰 타입*/
    @Enumerated(EnumType.STRING)
    private Type type;

    /*쿠폰 할인 금액*/
    private int discountAmount;

    /*쿠폰 적용 가능 금액*/
    private int leastAmount;

    /*쿠폰 시작일*/
    private Date openDate;

    /*쿠폰 종료일*/
    private Date endDate;

    /*쿠폰 생성일*/
    @CreatedDate
    private Date createdAt;



}
