package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.inner.service.CouponItemService;
import com.tobias.couponservice.outer.dto.FindMyCouponDetailResponse;
import com.tobias.couponservice.outer.dto.ResponseMessage;
import com.tobias.couponservice.outer.dto.SaveMyCouponRequest;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/myCoupon")
public class MyCouponResource {

	private final CouponItemService couponItemService;

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1/{userid}/{couponid}")
	public ResponseEntity<ResponseMessage> saveMyCoupon(SaveMyCouponRequest saveMyCouponRequest){
		couponItemService.saveMyCoupon(saveMyCouponRequest);
		return ResponseEntity.ok(new ResponseMessage());
	}


	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = FindMyCouponDetailResponse.class))))
	@PostMapping("/v1/{userid}")
	public ResponseEntity<List<FindMyCouponDetailResponse>> findMyCoupon(String userid){
		return ResponseEntity.ok(couponItemService.findMyCoupon(userid));
	}



	@ApiResponse(responseCode = "200")
	@PutMapping("/v1/{userid}/{couponid}")
	public ResponseEntity useMyCoupon(String userid, Long couponItemId){
		return null;
	}

}