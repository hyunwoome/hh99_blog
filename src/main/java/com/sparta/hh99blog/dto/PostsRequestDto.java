package com.sparta.hh99blog.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PostsRequestDto {
    private final String name;
    private final String title;
    private final String content;
}
