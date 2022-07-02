package com.codingdojo.omikujiform;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session, Model model) {
		
//		String result = (String) session.getAttribute("resultOmikuji");
//		model.addAttribute("result", result);
		
		Integer a = (Integer) session.getAttribute("number");
		String b = (String) session.getAttribute("city");
		String c = (String) session.getAttribute("person");
		String d = (String) session.getAttribute("hobby");
		String e = (String) session.getAttribute("livingThing");
		String f = (String) session.getAttribute("message");

		model.addAttribute("number", a);
		model.addAttribute("city", b);
		model.addAttribute("person", c);
		model.addAttribute("hobby", d);
		model.addAttribute("livingThing", e);
		model.addAttribute("message", f);
		
		return "result.jsp";
	}
	
	@PostMapping("/processFormData")
	public String process(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("hobby") String hobby,
			@RequestParam("livingThing") String livingThing,
			@RequestParam("message") String message,
			HttpSession session
			) {
		
//		String resultOmikuji = String.format(
//				"In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.",
//				number, city, person, hobby, livingThing, message);
				
		//do stuff
//		session.setAttribute("resultOmikuji", resultOmikuji);
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("message", message);
		
		return "redirect:/omikuji/show";
	}


}