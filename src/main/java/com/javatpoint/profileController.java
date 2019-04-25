package com.javatpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class profileController {
	@RequestMapping("/profile")
	public String profile()
	{
		return "THis is a profile page.i have created another page for that";
	}

}
