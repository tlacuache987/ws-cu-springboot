package org.certificatic.springboot;

import org.certificatic.springboot.configuration.ApplicationConfig;
import org.certificatic.springboot.domain.Person;
import org.certificatic.springboot.util.Color;
import org.certificatic.springboot.util.ColorWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		ColorWriter colorWriter = ctx.getBean(ColorWriter.class);

		Person ivan1 = ctx.getBean("ivan", Person.class);

		// log.info("ivan1 is : {}", ivan1);
		log.info("{}", colorWriter.getColoredMessage(Color.BLUE, "ivan1 is: " + ivan1));

		Person ivan2 = ctx.getBean("ivan", Person.class);

		// log.info("ivan1 == ivan2 : {}", ivan1 == ivan2);
		log.info("{}", colorWriter.getColoredMessage(Color.GREEN, "ivan1 == ivan2 : " + (ivan1 == ivan2)));

		Person paula1 = ctx.getBean("paula", Person.class);

		// log.info("paula1 is: {}", paula1);
		log.info("{}", colorWriter.getColoredMessage(Color.BLUE, "paula1 is: " + paula1));

		Person paula2 = ctx.getBean("paula", Person.class);

		// log.info("paula2 is: {}", paula2);
		log.info("{}", colorWriter.getColoredMessage(Color.BLUE, "paula2 is: " + paula2));

		// log.info("paula1 == paula2 : {}", paula1 == paula2);
		log.info("{}", colorWriter.getColoredMessage(Color.RED, "paula1 == paula2 : " + (paula1 == paula2)));

		((AbstractApplicationContext) ctx).close();
	}

}
