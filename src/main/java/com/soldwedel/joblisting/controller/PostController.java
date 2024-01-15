package com.soldwedel.joblisting.controller;

import com.soldwedel.joblisting.repository.PostRepository;
import com.soldwedel.joblisting.model.Post;
import com.soldwedel.joblisting.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchRepo;

    @GetMapping("/allPosts")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Post> getAllPosts(){

    return repo.findAll();
    }

    @GetMapping("/posts/{text}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Post> search(@PathVariable String text){

        return searchRepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }



}
