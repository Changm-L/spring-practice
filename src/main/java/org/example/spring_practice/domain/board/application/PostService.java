package org.example.spring_practice.domain.board.application;

import org.example.spring_practice.domain.board.dto.PostDto;
import org.example.spring_practice.domain.board.entity.Post;
import org.example.spring_practice.domain.board.entity.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
        return postRepository.findById(id).orElseThrow();
    }

    public void update(Long id, PostDto postDto) {
        Post post = postRepository.findById(id).orElseThrow();
        Post updateValue = postDto.toEntity();
        post.update(updateValue);
        postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
