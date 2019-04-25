package com.javatpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class detailController {
	@RequestMapping("/details")
	public String details() {
		return "THis is a details page. you will find every details of web application here.";
	}
	
}
