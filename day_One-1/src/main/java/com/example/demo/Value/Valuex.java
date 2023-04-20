package com.example.demo.Value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Valuex {
	@Value("Sujay")
	private String Name;
	@RequestMapping("/name")
	@ResponseBody
	public String Message () {
		return "My Name is :"+Name;
	}
}
