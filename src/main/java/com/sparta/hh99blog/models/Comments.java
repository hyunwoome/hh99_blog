package com.sparta.hh99blog.models;

import com.sparta.hh99blog.dto.CommentsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Comments extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // #1. 이름
    @Column(nullable = false)
    private String name;

    // #2. 내용
    @Column(nullable = false)
    private String content;

    public Comments(CommentsRequestDto commentsRequestDto) {
        this.name = commentsRequestDto.getName();
        this.content = commentsRequestDto.getContent();
    }

    public void update(CommentsRequestDto commentsRequestDto) {
        this.name = commentsRequestDto.getName();
        this.content = commentsRequestDto.getContent();
    }
}
