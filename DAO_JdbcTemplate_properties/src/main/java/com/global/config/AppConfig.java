package com.global.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.global")
@PropertySource("classpath:db.properties")
public class AppConfig {

	@Autowired
	Environment environment;
	
	@Bean
	DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(environment.getProperty("driver"));
		ds.setUrl(environment.getProperty("url"));
		ds.setUsername(environment.getProperty("dbuser"));
		ds.setPassword(environment.getProperty("dbpassword"));
		return ds;
	}
}
