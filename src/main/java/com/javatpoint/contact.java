package com.javatpoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class contact {
	@RequestMapping("/contact")
	public String contactController() {
		return "I have created second page called contact\n 4529 sobieski street detroit Mi 48212";
		
	}
	

}
