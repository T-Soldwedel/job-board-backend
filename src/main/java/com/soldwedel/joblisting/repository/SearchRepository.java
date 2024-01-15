package com.soldwedel.joblisting.repository;

import com.soldwedel.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
