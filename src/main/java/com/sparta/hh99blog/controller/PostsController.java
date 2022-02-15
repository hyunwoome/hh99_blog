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

    // #1. 전체 게시글 조회
    @GetMapping("/api/posts")
    public List<Posts> getPosts() {
        return postsRepository.findAll();
    }

    // #2. 게시글 작성
    @PostMapping("/api/posts")
    public Posts createPost(@RequestBody PostsRequestDto postsRequestDto) {
        Posts posts = new Posts(postsRequestDto);
        return postsRepository.save(posts);
    }

    // #4. 게시글 수정
    @PutMapping("/api/posts/{id}")
    public Long updatePost(@PathVariable Long id, @RequestBody PostsRequestDto postsRequestDto) {
        return postsService.update(id, postsRequestDto);
    }

    // #5. 게시글 삭제
    @DeleteMapping("/api/posts/{id}")
    public Long deletePost(@PathVariable Long id) {
        postsRepository.deleteById(id);
        return id;
    }
}
