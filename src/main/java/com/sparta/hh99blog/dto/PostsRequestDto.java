package com.sparta.hh99blog.dto;

import com.sparta.hh99blog.domain.Comments;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class PostsRequestDto {
    private final String name;
    private final String title;
    private final String content;
    private final List<Comments> comments;
}