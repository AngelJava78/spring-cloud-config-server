package com.ntt.liveupdate.books.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OffersController {
	@Value("${offers.discount:35%}")
	private String discount;
	
	@GetMapping("view-discounts")
	public String viewDiscounts() {
		return "Discount is " + discount;
	}
}
