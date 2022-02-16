package com.sparta.hh99blog.service;

import com.sparta.hh99blog.dto.PostsRequestDto;
import com.sparta.hh99blog.domain.Posts;
import com.sparta.hh99blog.repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long update(Long id, PostsRequestDto postsRequestDto) {
        Posts posts = postsRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        posts.update(postsRequestDto);
        return posts.getId();
    }
}
