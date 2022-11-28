package com.tobias.couponservice.outer.dto.manager;

import com.tobias.couponservice.inner.domain.entity.standardType.Type;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class RegisteredPromotionCouponDto {

    //- 관리자 일련 번호
    @NotNull(message = "관리자 일련 번호는 필수입니다.")
    private String brandid;

    //- 쿠폰 내용
    @NotNull(message = "쿠폰 내용은 필수입니다.")
    private String content;

    //- 쿠폰 타입
    @NotNull(message = "쿠폰 타입은 필수입니다.")
    private Type type;

    //- 쿠폰 할인 금액
    @NotNull(message = "쿠폰 할인 금액은 필수입니다.")
    private int discountAmount;

    //- 쿠폰 적용 가능 금액
    @NotNull(message = "쿠폰 적용 가능 금액은 필수입니다.")
    private int leastAmount;

    //- 쿠폰 시작일
    @NotNull(message = "쿠폰 시작일은 필수입니다.")
    private Date startDate;

    //- 쿠폰 종료일
    @NotNull(message = "쿠폰 종료일은 필수입니다.")
    private Date endDate;

}
