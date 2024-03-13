package org.example.spring_practice.domain.board.entity;

import jakarta.persistence.*;
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

    @Column(nullable = false, columnDefinition = "text")
    private String title;

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
}
