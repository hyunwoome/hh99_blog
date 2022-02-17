package com.sparta.hh99blog.repository;

import com.sparta.hh99blog.domain.Posts;
import com.sparta.hh99blog.domain.PostsMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.createdAt DESC")
    List<PostsMapping> findAllExceptContent();

    List<Posts> findAllByOrderByModifiedAtDesc();
}
