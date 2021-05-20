package com.tts.TechTalentBlog.service;

import com.tts.TechTalentBlog.model.BlogPost;
import com.tts.TechTalentBlog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogPostServiceImpl implements BlogPostService {

    @Autowired
    BlogPostRepository blogPostRepository;

//    lines 11&12 can also be written as follows
//    public BlogPostServiceImpl(BlogPostRepository blogPostRepository) {
//        this.blogPostRepository = blogPostRepository;
//    }

    @Override
    public BlogPost addNewBlogPost(BlogPost blogPost){
        return blogPostRepository.save(blogPost);
    }
}
