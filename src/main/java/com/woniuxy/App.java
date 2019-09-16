package com.woniuxy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.woniuxy.App;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.woniuxy")
@MapperScan("com.woniuxy.dao")
public class App {
public static void main(String[] args) {
	SpringApplication.run(App.class, args);
}
}
