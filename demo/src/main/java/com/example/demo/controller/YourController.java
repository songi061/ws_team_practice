package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/a")
public class YourController {

	
	@RequestMapping("/main")
	public @ResponseBody String main() {
		
		return"1111111";
	}
}
