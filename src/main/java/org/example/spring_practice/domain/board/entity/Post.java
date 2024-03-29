package org.example.spring_practice.domain.board.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "제목은 필수값입니다.")
    @Column(nullable = false, columnDefinition = "text")
    private String title;

    @NotEmpty(message = "내용은 필수값입니다.")
    @Column(nullable = false, columnDefinition = "text")
    private String content;

    @CreationTimestamp
    @Column(name = "insert_date", nullable = false)
    private LocalDateTime insertDate;

    @UpdateTimestamp
    @Column(name = "update_date")
    private LocalDateTime updateDate;

    @Column(nullable = false)
    private int views;

    public void update(Post updateValue) {
        this.title = updateValue.title;
        this.content = updateValue.content;
    }
}
