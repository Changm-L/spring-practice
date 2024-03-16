package org.example.spring_practice.domain.board.presentation;

import org.apache.coyote.Response;
import org.example.spring_practice._common.dto.ResponseDto;
import org.example.spring_practice.domain.board.application.PostService;
import org.example.spring_practice.domain.board.dto.PostDto;
import org.example.spring_practice.domain.board.entity.Post;
import org.example.spring_practice.domain.board.entity.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/{id}")
    public ResponseDto<Object> listById(@PathVariable Long id) {
        System.out.println("result" + postService.getPostById(id));
        return ResponseDto.of(201, "Success", postService.getPostById(id));
    }

    @PostMapping("/list")
    public ResponseDto<Object> list(@Valid @RequestBody PostDto postRequest) {
        postService.save(postRequest.toEntity());
        return ResponseDto.of(201, "Success", null);
    }

    @PutMapping("/{id}")
    public ResponseDto<Object> update(@PathVariable Long id, @Valid @RequestBody PostDto postRequest) {
        postService.update(id, postRequest);
        return ResponseDto.of(201, "Success", null);
    }
}

