package com.tobias.couponservice.outer.web.rest;


import com.tobias.couponservice.outer.dto.BrandCouponRequestRes;
import com.tobias.couponservice.outer.dto.PromotionCouponRequest;
import com.tobias.couponservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotionCoupon")
public class PromotionCouponResource {


	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1/{managerid}")
	public ResponseEntity promotionCouponRequest(@RequestBody PromotionCouponRequest promotionCouponRequest){

	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1/{managerid}/{couponid}")
	public ResponseEntity brandCouponPermit(@PathVariable("couponid") long couponid, @PathVariable("managerid") long managerid){

	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = BrandCouponRequestRes.class))))
	public ResponseEntity<List<BrandCouponRequestRes>> findBrandCouponRequest(){
		return null;
	}

}