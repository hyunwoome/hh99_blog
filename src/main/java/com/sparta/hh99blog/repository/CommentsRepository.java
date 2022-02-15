package com.sparta.hh99blog.repository;

import com.sparta.hh99blog.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
//    List<Comments> findAllByOrderByModifiedAtDesc();
}
