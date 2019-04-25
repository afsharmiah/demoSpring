package com.javatpoint;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class career {
	@RequestMapping("/career")
	public String careerController() {
		return "Ther is no new job here. please contact with me later\ni will give you a job";
		
	}

}
