package com.sparta.hh99blog.repository;

import com.sparta.hh99blog.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {
//    List<Posts> findAllByOrderByModifiedAtDesc();
}
