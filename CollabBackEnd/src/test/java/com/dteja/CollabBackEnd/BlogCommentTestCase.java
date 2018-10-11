package com.dteja.CollabBackEnd;

import static org.junit.Assert.fail;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dteja.dao.BlogCommentDAO;
import com.dteja.model.BlogComment;

public class BlogCommentTestCase {

	static BlogCommentDAO blogCommentDAO;

	@BeforeClass
	public void Setup() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.dteja");
		context.refresh();
		blogCommentDAO = (BlogCommentDAO) context.getBean("blogCommentDAO");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
