package com.sparta.hh99blog.repository;

import com.sparta.hh99blog.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    List<Posts> findAllByOrderByModifiedAtDesc();
}
