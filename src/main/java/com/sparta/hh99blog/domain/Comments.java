package com.sparta.hh99blog.domain;

import com.sparta.hh99blog.dto.CommentsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Comments extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long postId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String content;

    // 생성자
    public Comments(CommentsRequestDto commentsRequestDto) {
        this.postId = commentsRequestDto.getPostId();
        this.name = commentsRequestDto.getName();
        this.content = commentsRequestDto.getContent();
    }

    // 수정
    public void update(CommentsRequestDto commentsRequestDto) {
        this.postId = commentsRequestDto.getPostId();
        this.name = commentsRequestDto.getName();
        this.content = commentsRequestDto.getContent();
    }
}
