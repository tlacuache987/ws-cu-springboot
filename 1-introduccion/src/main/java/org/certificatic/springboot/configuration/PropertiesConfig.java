package org.certificatic.springboot.configuration;

import org.certificatic.springboot.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({ "classpath:/application.properties" })
public class PropertiesConfig {

	@Bean
	public Person ivan() {
		return Person.builder().name("Ivan").age(31).build();
	}

}
