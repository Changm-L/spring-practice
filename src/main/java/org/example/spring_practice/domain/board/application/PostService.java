package org.example.spring_practice.domain.board.application;

import org.example.spring_practice.domain.board.application.dto.PostRequest;
import org.example.spring_practice.domain.board.entity.Post;
import org.example.spring_practice.domain.board.entity.PostRepository;
import org.example.spring_practice.domain.board.exception.PostNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void save(Post post) {
        postRepository.save(post);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post getPostById(Long id) {
        return postRepository.findByEntity(id);
    }

    public void update(Long id, PostRequest postDto) {
        Post post = postRepository.findByEntity(id);
        Post updateValue = postDto.toEntity();
        post.update(updateValue);
        postRepository.save(post);
    }

    public void deletePost(Long id) {
        if(!postRepository.existsById(id)) throw new PostNotFoundException();
        postRepository.deleteById(id);
    }
}
