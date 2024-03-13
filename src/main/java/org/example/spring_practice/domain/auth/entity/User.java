package org.example.spring_practice.domain.auth.entity;

import jakarta.persistence.*;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

//    @OneToOne
//    private Job job; // job_id
}

//@Entity
//class Job {
//    private long id;
//    private String name;
//}
