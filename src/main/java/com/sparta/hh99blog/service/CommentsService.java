package com.sparta.hh99blog.service;

import com.sparta.hh99blog.dto.CommentsRequestDto;
import com.sparta.hh99blog.models.Comments;
import com.sparta.hh99blog.repository.CommentsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class CommentsService {
    private final CommentsRepository commentsRepository;

    @Transactional
    public Long update(Long id, CommentsRequestDto requestDto) {
        Comments comments = commentsRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );
        comments.update(requestDto);
        return comments.getId();
    }
}
