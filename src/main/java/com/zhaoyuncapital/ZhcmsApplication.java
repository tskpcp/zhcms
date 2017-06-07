package com.zhaoyuncapital;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Date;

@Controller
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.zhaoyncapital.mapper")
public class ZhcmsApplication {
	private static Logger logger= Logger.getLogger( ZhcmsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ZhcmsApplication.class, args);
		logger.info("=================SpringBoot Start Success===================");
	}

	@RequestMapping("/")
	String home(){
		return "redirect:countries";
	}

	@RequestMapping("/now")
	String hehe() {
		return "现在时间：" + (new Date()).toLocaleString();
	}
}
