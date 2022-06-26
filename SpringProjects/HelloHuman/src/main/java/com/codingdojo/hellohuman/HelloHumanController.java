package com.codingdojo.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	
	@RequestMapping("")
	public String giveName(
			@RequestParam(value="first_name", required=false) String first_name,
			@RequestParam(value="last_name", required=false) String last_name
			) {
		
		String full_name;
		
		if(first_name == null && last_name == null) {
			full_name = "Human";
		}
		else if (first_name != null && last_name != null) {
			full_name = first_name + " " + last_name;
		}
		else {
			full_name = first_name == null ?
				"Esteemed Citizen " + last_name:
				"Esteemed Citizen " + first_name;
		}
		
		return String.format(
				"<a href='/'>Go Back</a>"
				+ "<h1>Hello %s!</h1>"
				+ "", full_name);
				
	}
}
