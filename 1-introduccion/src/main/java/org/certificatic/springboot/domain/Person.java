package org.certificatic.springboot.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {

	private String name;
	private int age;

	private Car car;
}
