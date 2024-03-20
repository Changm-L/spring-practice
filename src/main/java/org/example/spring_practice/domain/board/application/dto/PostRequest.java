package org.example.spring_practice.domain.board.application.dto;

import lombok.*;
import org.example.spring_practice.domain.board.entity.Post;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostRequest {
    private String title;
    private String content;

    public Post toEntity() {
        return Post.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }
}
