package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.jsp")
public class Configure {
	
	@Bean //this will inform jvm that the object which is returned by this method should be stored inside IOC container
	// we can use it in Spring also
	public EntityManager getEntityManager()
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		return factory.createEntityManager();
	}
	
	@Bean
	public EntityTransaction getTransaction()
	{
		return getEntityManager().getTransaction();
	}
}
