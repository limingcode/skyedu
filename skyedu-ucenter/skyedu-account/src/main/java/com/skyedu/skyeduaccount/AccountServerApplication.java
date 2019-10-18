package com.skyedu.skyeduaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 账户服务
 * @author LiMing
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.skyedu.skyeduaccount.dao")
@EnableDiscoveryClient
public class AccountServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServerApplication.class, args);
	}

}
