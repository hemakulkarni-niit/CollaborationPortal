package com.dteja.CollabBackEnd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dteja.config.HibernateConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
	}
}