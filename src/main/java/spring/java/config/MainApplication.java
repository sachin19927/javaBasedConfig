package spring.java.config;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;

public class MainApplication {

public static void main(String[] args) {
	
	
	ApplicationContext applicationContext=new  AnnotationConfigApplicationContext(Javaconfig.class);
	
	//BlogPostService blogPostService=applicationContext.getBean(BlogPostService.class);
	BlogPostService blogPostService=(BlogPostService) applicationContext.getBean("blogpostService");
	
	BlogPost blog=new BlogPost();
	blog.setId(1);
	blog.setContent("post detail");
	blog.setTitle("Post");
	blog.setPublishDate(new Date());
	blogPostService.save(blog);

((ConfigurableApplicationContext)applicationContext).close();

}
}
