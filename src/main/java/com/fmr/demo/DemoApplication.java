 package com.fmr.demo;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.fmr.demo.service.OrderService;
//@ComponentScan({"com.demo", "com.demo1"})
@SpringBootApplication
public class DemoApplication {
	@Bean
	DataSource dataSource(){
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/fidelity", "root", "");
	}
	
	public static void main(String[] args) {
		ApplicationContext container = SpringApplication.run(DemoApplication.class, args);
		OrderService orderService= container.getBean(OrderService.class);
		orderService.save();
	}
}
