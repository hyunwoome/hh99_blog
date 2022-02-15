package com.sparta.hh99blog.controller;

import com.sparta.hh99blog.dto.PostsRequestDto;
import com.sparta.hh99blog.models.Posts;
import com.sparta.hh99blog.repository.PostsRepository;
import com.sparta.hh99blog.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsController {

    private final PostsRepository postsRepository;
    private final PostsService postsService;

    @GetMapping("/api/posts")
    public List<Posts> getPosts() {
        return postsRepository.findAll();
    }

    @PostMapping("/api/posts")
    public Posts createPost(@RequestBody PostsRequestDto postsRequestDto) {
        Posts posts = new Posts(postsRequestDto);
        return postsRepository.save(posts);
    }

    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostsRequestDto postsRequestDto) {
        return postsService.update(id, postsRequestDto);
    }

    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id) {
        postsRepository.deleteById(id);
        return id;
    }
}
