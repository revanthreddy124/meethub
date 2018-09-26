package com.niit.dao;

import com.niit.models.BlogPost;
import com.niit.models.BlogPostLikes;

public interface BlogPostLikesDao {
	
	BlogPostLikes hasUserLikedBlog(int blogId,String email);

	BlogPost updateLikes(int id,String email);

}
