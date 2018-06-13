package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import spring.java.service.BlogPostService;
import spring.java.serviceImpl.BlogPostServiceImpl;

@ComponentScan(basePackages="spring.java")
public class Javaconfig {

	@Bean //default bean id will be same as method name
	public BlogPostService blogpostService()
	{
		return new BlogPostServiceImpl();
	}
	
	@Bean //bean id will be same as method name
	public BlogPostService blogpostService2()
	{
		return new BlogPostServiceImpl();
	}
}
