package org.example.spring_practice.domain.board.entity;

import org.example.spring_practice.domain.board.exception.PostNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    default Post findByEntity(Long id) {
        return findById(id).orElseThrow(PostNotFoundException::new);
    }
}
