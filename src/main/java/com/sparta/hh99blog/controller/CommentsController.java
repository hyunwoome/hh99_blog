package com.sparta.hh99blog.controller;

import com.sparta.hh99blog.dto.CommentsRequestDto;
import com.sparta.hh99blog.domain.Comments;
import com.sparta.hh99blog.repository.CommentsRepository;
import com.sparta.hh99blog.service.CommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class CommentsController {

    private final CommentsRepository commentsRepository;
    private final CommentsService commentsService;

    @GetMapping("/api/comments/{postId}")
    public List<Comments> getComments(@PathVariable Long postId) {
        return commentsRepository.findAllByPostId(postId);
    }

    @PostMapping("/api/comments")
    public Comments createComment(@RequestBody CommentsRequestDto commentsRequestDto) {
        Comments comments = new Comments(commentsRequestDto);
        return commentsRepository.save(comments);
    }

    @PutMapping("/api/comments/{id}")
    public Long updateComment(@PathVariable Long id, @RequestBody CommentsRequestDto commentsRequestDto) {
        return commentsService.update(id, commentsRequestDto);
    }

    @DeleteMapping("/api/comments/{id}")
    public Long deleteComment(@PathVariable Long id) {
        commentsRepository.deleteById(id);
        return id;
    }
}
