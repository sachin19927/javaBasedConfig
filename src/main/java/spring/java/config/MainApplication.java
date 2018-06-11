package spring.java.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.java.service.BlogPostService;

public class MainApplication {

public static void main(String[] args) {
	
	
	ApplicationContext applicationContext=new  AnnotationConfigApplicationContext(Javaconfig.class);
	
	BlogPostService blogPostService=applicationContext.getBean(BlogPostService.class);
	
}
}
