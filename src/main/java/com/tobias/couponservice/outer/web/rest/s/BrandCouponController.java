package com.tobias.couponservice.outer.web.rest.s;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "brandCoupon", description = "브랜드 쿠폰 API")
@RestController
@RequestMapping("/brandCoupon")
public class BrandCouponController {


//    @Operation(summary= "브랜드 쿠폰 등록 요청", tags = "브랜드 쿠폰")
//    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
//    @PostMapping("/v1")
//    public ResponseEntity postBrandCoupon(@RequestBody PostBrandCouponRequest request) {
//
//        return ResponseEntity.ok(new ResponseMessage("쿠폰 등록 요청이 정상 처리되었습니다."));
//    }
//
//
//
//    @Operation(summary= "브랜드 쿠폰 조회", tags = "브랜드 쿠폰")
//    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = getCouponItemAndUseridResponse.class))))
//    @GetMapping("/v1/{brandid}")
//    public void getBrandCoupon(@PathVariable("brandid") String brandid) {
//
//
//    }
//
//
//
//
//    @Operation(summary= "브랜드 쿠폰 등록 요청 조회", tags = "브랜드 쿠폰")
//    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GetBrandReqeustCoupnResponse.class))))
//    @GetMapping("/v1")
//    public void getBrandRequestCoupon() {
//
//
//    }



}
