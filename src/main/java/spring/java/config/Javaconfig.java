package spring.java.config;

import org.springframework.context.annotation.Bean;

import spring.java.service.BlogPostService;
import spring.java.serviceImpl.BlogPostServiceImpl;

public class Javaconfig {

	@Bean //bean id will be same as method name
	public BlogPostService blogpostService()
	{
		return new BlogPostServiceImpl();
	}
}
