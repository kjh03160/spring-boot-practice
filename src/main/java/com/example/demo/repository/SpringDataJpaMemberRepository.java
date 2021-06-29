package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL : select m from Member m where m.name = ?
    // findByNameAndId -> select m from Member m where m.name = ? and m.id = ?
    @Override
    Optional<Member> findByName(String name);
}
