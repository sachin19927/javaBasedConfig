package spring.java.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;

public class BlogPostServiceImpl implements BlogPostService {

	 
	private static final Logger LOGGER=LoggerFactory.getLogger(BlogPostServiceImpl.class);
	public void save(BlogPost blogpost) {
		// TODO Auto-generated method stub
		LOGGER.debug("BlogPostServiceImpl : save post is  called");
		
	}

}
