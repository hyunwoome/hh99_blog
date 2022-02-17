package com.sparta.hh99blog.controller;

import com.sparta.hh99blog.domain.PostsMapping;
import com.sparta.hh99blog.dto.PostsRequestDto;
import com.sparta.hh99blog.domain.Posts;
import com.sparta.hh99blog.repository.CommentsRepository;
import com.sparta.hh99blog.repository.PostsRepository;
import com.sparta.hh99blog.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PostsController {

    private final PostsRepository postsRepository;
    private final PostsService postsService;
    private final CommentsRepository commentsRepository;

    @GetMapping("/api/posts")
    public List<PostsMapping> getPosts() {
        return postsRepository.findAllExceptContent();
    }

    @GetMapping("/api/posts/{id}")
    public Optional<Posts> getPost(@PathVariable Long id) {
        return postsRepository.findById(id);
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
        commentsRepository.deleteAddTextByPostId(id);
        return id;
    }
}
