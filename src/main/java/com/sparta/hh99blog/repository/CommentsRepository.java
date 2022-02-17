package com.sparta.hh99blog.repository;

import com.sparta.hh99blog.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface CommentsRepository extends JpaRepository<Comments, Long> {

    @Transactional
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query("DELETE FROM Comments c WHERE c.postId = ?1")
    void deleteAddTextByPostId(Long query);

    List<Comments> findAllByPostId(Long postId);
}
