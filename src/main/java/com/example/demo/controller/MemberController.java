package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // 공용으로 사용하기 위해 new로 안넣어준다
    private final MemberService memberService;

//    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

}
