package com.tobias.couponservice.outer.web.rest.s;

import com.tobias.couponservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "brandCoupon", description = "프로모션 쿠폰 API")
@RestController
@RequestMapping("/promotionCoupon")
public class PromotionCouponController {


//    @Operation(summary= "프로모션 쿠폰 등록", tags = "프로모션 쿠폰")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class))),
//    })
//    @PostMapping("/v1/{managerid}")
//    public ResponseEntity postPromotionCoupon() {
//        return ResponseEntity.ok(new ResponseMessage("쿠폰이 등록되었습니다."));
//    }
//
//
//
//
//    @Operation(summary= "프로모션 쿠폰 조회", tags = "프로모션 쿠폰")
//    @ApiResponses({
//            @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GetPromotionCouponResponse.class)))),
//    })
//    @GetMapping("/v1")
//    public void getPromotionCoupon() {
//
//    }





}
