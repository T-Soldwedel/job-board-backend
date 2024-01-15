package com.soldwedel.joblisting.repository;

import com.soldwedel.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
