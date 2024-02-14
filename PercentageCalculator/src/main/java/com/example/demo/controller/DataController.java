package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	
	@GetMapping("/data")
	public String getData(@RequestParam String name,
			@RequestParam double m1,
			@RequestParam double m2,
			@RequestParam double m3,
			@RequestParam double m4,
			@RequestParam double m5) {
		double totalMarks=m1+m2+m3+m4+m5;
		double percentage=(totalMarks/500)*100;
		return "Hey! "+name+" Your percentage is : "+percentage;
		
	}
	

}
