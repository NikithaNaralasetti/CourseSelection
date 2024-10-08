package com.klef.jfsd.springboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SController {
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	@GetMapping("/login")
	public String LoginPage()
	{
		return "Loginpage";
	}
	@GetMapping("/Dashboard")
	public String Dashboard()
	{
		return "Dashboard";
	}


}