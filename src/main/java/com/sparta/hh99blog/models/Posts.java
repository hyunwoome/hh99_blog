package com.sparta.hh99blog.models;

import com.sparta.hh99blog.dto.CommentsRequestDto;
import com.sparta.hh99blog.dto.PostsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    public Posts(PostsRequestDto postsRequestDto) {
        this.name = postsRequestDto.getName();
        this.title = postsRequestDto.getTitle();
        this.content = postsRequestDto.getTitle();
    }

    public void update(PostsRequestDto requestDto) {
        this.name = requestDto.getName();
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
    }
}
