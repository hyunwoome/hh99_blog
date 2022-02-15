package com.sparta.hh99blog.models;

import com.sparta.hh99blog.dto.PostsRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    // #1. 이름
    @Column(nullable = false)
    private String name;

    // #2. 제목
    @Column(nullable = false)
    private String title;

    // #3. 내용
    @Column(nullable = false)
    private String content;

    // 댓글과 1:N 관계
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn
//    private Collection<Comments> comments;

    public Posts(PostsRequestDto postsRequestDto) {
        this.name = postsRequestDto.getName();
        this.title = postsRequestDto.getTitle();
        this.content = postsRequestDto.getContent();
    }

    public void update(PostsRequestDto postsRequestDto) {
        this.name = postsRequestDto.getName();
        this.title = postsRequestDto.getTitle();
        this.content = postsRequestDto.getContent();
    }
}
