package com.codingdojo.ninjagoldgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/gold";
	}
	
	@GetMapping("/gold")
	public String main() {
		return "index.jsp";
	}

}
