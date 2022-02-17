package com.sparta.hh99blog.domain;

import com.sparta.hh99blog.dto.PostsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    // 생성자
    public Posts(PostsRequestDto postsRequestDto) {
        this.name = postsRequestDto.getName();
        this.title = postsRequestDto.getTitle();
        this.content = postsRequestDto.getContent();
    }

    // 수정
    public void update(PostsRequestDto postsRequestDto) {
        this.name = postsRequestDto.getName();
        this.title = postsRequestDto.getTitle();
        this.content = postsRequestDto.getContent();
    }
}
