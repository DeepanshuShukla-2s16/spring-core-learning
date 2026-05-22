package com.deepanshu.spring_core_learning.spring_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * Spring Java Configuration class.
 */
@Configuration
@ComponentScan(basePackages = "com.deepanshu.spring_core_learning.spring_java_config")
public class JavaSpringConfig {

	@Bean
	public Address address() {
		System.out.println("creating bean through Bean annotation");
		Address address = new Address();
		address.setCity("Allahabad");
		address.setState("UP");
		
	    return address;
	}
}