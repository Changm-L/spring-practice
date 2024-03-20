package org.example.spring_practice.domain.board.presentation;

import jakarta.validation.Valid;
import org.example.spring_practice._common.dto.ResponseDto;
import org.example.spring_practice.domain.board.application.PostService;
import org.example.spring_practice.domain.board.application.dto.PostRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public ResponseDto<Object> list() {
        return ResponseDto.of(HttpStatus.OK, "Success", postService.getAllPosts());
    }

    @GetMapping("/{id}")
    public ResponseDto<Object> listById(@PathVariable Long id) {
        System.out.println("result" + postService.getPostById(id));
        return ResponseDto.of(HttpStatus.OK, "Success", postService.getPostById(id));
    }

    @PostMapping("/list")
    public ResponseDto<Object> list(@Valid @RequestBody PostRequest postRequest) {
        postService.save(postRequest.toEntity());
        return ResponseDto.of(HttpStatus.OK, "Success", null);
    }

    @PutMapping("/{id}")
    public ResponseDto<Object> update(@PathVariable Long id, @RequestBody @Valid PostRequest postRequest) {
        postService.update(id, postRequest);
        return ResponseDto.of(HttpStatus.CREATED, "Success", null);
    }

    @DeleteMapping("/{id}")
    public ResponseDto<Object> delete(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseDto.of(HttpStatus.OK, "Success", null);
    }
}

