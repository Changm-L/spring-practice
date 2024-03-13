package org.example.spring_practice.domain.board.dto;

import lombok.*;

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



}
