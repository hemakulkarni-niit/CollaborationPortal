package com.dteja.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dteja.model.BlogComment;

@Repository("blogCommentDAO")
//@Transactional
public class BlogCommentDAOImpl implements BlogCommentDAO {
	@Autowired
	SessionFactory sessionFactory;

	@Transactional
	public boolean updateComment(BlogComment blogComment) {

		return false;
	}

	@Transactional
	public boolean deleteComment(BlogComment blogComment) {

		return false;
	}

	@Transactional
	public BlogComment getBlogComment(int blogCommentId) {

		return null;
	}

	@Transactional
	public List<BlogComment> listBlogComments(int blogId) {

		return null;
	}

	@Transactional
	public boolean addComment(BlogComment blogComment) {

		return false;
	}
}