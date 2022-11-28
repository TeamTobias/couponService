package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.outer.vo.ResponseMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Tag(name = "promotionCoupon", description = "프로모션 쿠폰 API")
@RestController
@RequestMapping("/promotionCoupon")
public class CouponController {


    // 프로모션 쿠폰 등록
    @Operation(summary= "프로모션 쿠폰 등록", tags = "프로모션 쿠폰")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class))),
    })
    @PostMapping("/v1/{managerid}")
    public void createCoupon() {


    }



}
