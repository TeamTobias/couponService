package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.inner.service.CouponItemService;
import com.tobias.couponservice.outer.dto.FindMyCouponDetailResponse;
import com.tobias.couponservice.outer.dto.ResponseMessage;
import com.tobias.couponservice.outer.dto.SaveMyCouponRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/myCoupon")
public class MyCouponResource {

	private final CouponItemService couponItemService;


	@Operation(summary = "내 쿠폰 등록")
	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1")
	public ResponseEntity<ResponseMessage> saveMyCoupon(@RequestBody SaveMyCouponRequest saveMyCouponRequest){
		couponItemService.saveMyCoupon(saveMyCouponRequest);
		return ResponseEntity.ok(new ResponseMessage());
	}


	@Operation(summary = "내 쿠폰 조회")
	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = FindMyCouponDetailResponse.class))))
	@GetMapping("/v1/{userid}")
	public ResponseEntity<List<FindMyCouponDetailResponse>> findMyCoupon(@PathVariable String userid){
		return ResponseEntity.ok(couponItemService.findMyCoupon(userid));
	}


	@Operation(summary = "내 쿠폰 사용")
	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PutMapping("/v1/{userid}/{couponid}")
	public ResponseEntity<ResponseMessage> useMyCoupon(@PathVariable String userid, @PathVariable long couponItemId){
		couponItemService.useMyCoupon(userid, couponItemId);
		return ResponseEntity.ok(new ResponseMessage());
	}

}