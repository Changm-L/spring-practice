package org.example.spring_practice.domain.board.dto;

import lombok.*;
import org.example.spring_practice.domain.board.entity.Post;

@Data
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private String title;
    private String content;

    public Post toEntity() {
        return Post.builder()
                .title(this.title)
                .content(this.content)
                .build();
    }
}
