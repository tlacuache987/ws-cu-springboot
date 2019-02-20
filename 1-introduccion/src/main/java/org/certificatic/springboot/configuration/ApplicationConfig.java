package org.certificatic.springboot.configuration;

import org.certificatic.springboot.domain.Car;
import org.certificatic.springboot.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = Car.class, basePackages = "org.certificatic.springboot.util")
@Import({ PropertiesConfig.class, EnginesConfig.class })
@ImportResource({ "classpath:/application-context.xml" })
public class ApplicationConfig {

	@Bean
	public Person ivan(Car car) {
		return Person.builder().name("Ivan").age(31).car(car).build();
	}

	@Bean
	@Scope("prototype")
	public Person paula(Car jetta) {
		return Person.builder().name("Paula").age(6).car(jetta).build();
	}

}
