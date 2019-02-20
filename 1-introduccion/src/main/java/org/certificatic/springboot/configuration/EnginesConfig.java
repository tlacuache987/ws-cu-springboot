package org.certificatic.springboot.configuration;

import org.certificatic.springboot.domain.Engine;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EnginesConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Engine fourCylinderEngine() {
		return Engine.builder().model("4 cilindros 2.0 lts").build();
	}

}
