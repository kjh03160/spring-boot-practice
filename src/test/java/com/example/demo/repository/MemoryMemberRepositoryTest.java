package com.example.demo.repository;

import com.example.demo.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class MemoryMemberRepositoryTest {

    MemoryMemberRespository respository = new MemoryMemberRespository();

    // 각 테스트 함수가 끝나면
    @AfterEach
    public void afterEach(){
        respository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName(("Spring"));

        respository.save(member);

        Member result = respository.findById(member.getId()).get();
        Assertions.assertEquals(member, result); // expected, result
        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("srping1");
        respository.save(member1);

        Member member2 = new Member();
        member2.setName("srping2");
        respository.save(member2);

        Member result = respository.findByName("srping1").get();

        org.assertj.core.api.Assertions.assertThat(member1).isEqualTo(member1);
    }

    @Test
    public void finaAll(){
        Member member1 = new Member();
        member1.setName("srping1");
        respository.save(member1);

        Member member2 = new Member();
        member2.setName("srping2");
        respository.save(member2);

        List<Member> result = respository.findAll();

        org.assertj.core.api.Assertions.assertThat(result.size()).isEqualTo(2);
    }
}
