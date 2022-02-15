package com.sparta.hh99blog.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CommentsRequestDto {
    private final String content;
}
