package com.zhaoyuncapital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("com.zhaoyuncapital.mapper")
public class ZhcmsApplication {
	private static Logger logger= Logger.getLogger( ZhcmsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ZhcmsApplication.class, args);
		logger.info("=================SpringBoot Start Success===================");
	}
//	@RequestMapping("/")
//	String home(){return "redirect:countries";}
}
