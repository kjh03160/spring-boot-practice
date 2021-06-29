package com.example.demo.domain;

import javax.persistence.*;

// JPA에서 사용해야됨
@Entity
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // Identiry는 db가 알아서 생성해주는 것
    private Long id;
    // 열 이름 다르게 하고 싶을 때
    @Column(name="username")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
