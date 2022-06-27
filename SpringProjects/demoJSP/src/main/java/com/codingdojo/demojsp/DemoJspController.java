package com.codingdojo.demojsp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoJspController {
	@RequestMapping("")
	public String index () {
		return "test";
	}


}
