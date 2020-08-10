package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	@GetMapping("/welcome")
	public String welcome()
	{
		return "WelCome Hirain";
	}
	
	
	@GetMapping("/insert")
	public String insert()
	{
		return "WelCome insert";
	}
	
	
	@GetMapping("/update")
	public String update()
	{
		return "WelCome update";
	}
	
	
	@GetMapping("/delete")
	public String delete()
	{
		return "WelCome delete";
	}
	
}
