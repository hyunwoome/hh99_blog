package com.sparta.hh99blog.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Getter
@RequiredArgsConstructor
public class CommentsRequestDto {
    private final Long postId;
    private final String name;

    @NotEmpty(message = "댓글 내용을 입력해주세요")
    private final String content;
}
