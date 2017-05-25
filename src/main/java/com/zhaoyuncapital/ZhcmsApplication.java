package com.zhaoyuncapital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class ZhcmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhcmsApplication.class, args);
	}
	@RequestMapping("/")
	String home(){return "redirect:countries";}
}
