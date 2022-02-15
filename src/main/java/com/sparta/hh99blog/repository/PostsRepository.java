package com.sparta.hh99blog.repository;

import com.sparta.hh99blog.models.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
