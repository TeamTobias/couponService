package com.tobias.couponservice.outer.web.rest;


import com.tobias.couponservice.inner.service.CouponService;
import com.tobias.couponservice.outer.dto.BrandCouponRequestRes;
import com.tobias.couponservice.outer.dto.PromotionCouponRequest;
import com.tobias.couponservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotionCoupon")
@RequiredArgsConstructor
public class PromotionCouponResource {

	private final CouponService couponService;

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1/{managerid}")
	public ResponseEntity promotionCouponRequest(@RequestBody PromotionCouponRequest promotionCouponRequest){
		couponService.promotionCouponRequest(promotionCouponRequest);
		return ResponseEntity.ok(new ResponseMessage("success"));
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1/{managerid}/{couponid}")
	public ResponseEntity brandCouponPermit(long couponid, long managerid){
		couponService.brandCouponPermit(couponid, managerid);
		return ResponseEntity.ok(new ResponseMessage("success"));
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = BrandCouponRequestRes.class))))
	public ResponseEntity<List<BrandCouponRequestRes>> findBrandCouponRequest(){
		List<BrandCouponRequestRes> brandCouponRequestReses = couponService.findBrandCouponRequest();
		return ResponseEntity.ok(brandCouponRequestReses);
	}

}