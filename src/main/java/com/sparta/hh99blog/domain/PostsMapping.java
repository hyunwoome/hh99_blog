package com.sparta.hh99blog.domain;

import java.time.LocalDateTime;

public interface PostsMapping {
    Long getId();
    LocalDateTime getCreatedAt();
    String getName();
    String getTitle();
}
