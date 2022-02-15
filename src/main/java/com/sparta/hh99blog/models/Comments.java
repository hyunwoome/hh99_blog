package com.sparta.hh99blog.models;

import com.sparta.hh99blog.dto.CommentsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Comments extends Timestamped {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String content;

    public Comments(CommentsRequestDto commentsRequestDto) {
        this.content = commentsRequestDto.getContent();
    }

    public void update(CommentsRequestDto requestDto) {
        this.content = requestDto.getContent();
    }
}
