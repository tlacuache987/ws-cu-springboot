package org.certificatic.springboot.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Car {

	@Value("${car.model:Cupra}")
	private String model;

	@Autowired
	private Engine engine;
}
