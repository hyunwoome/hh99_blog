package com.sparta.hh99blog.repository;

import com.sparta.hh99blog.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
