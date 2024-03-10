package com.study.erum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.erum.dto.MemberDTO;

@Controller
@RequestMapping("/member")// 이 컨트롤러의 모든 요청은 "/member"로 시작
public class MemberController {

  @PostMapping("/save")
  public String save(@ModelAttribute MemberDTO memberDTO) {
    
    
  }
  
  @GetMapping("/save")// HTTP GET 메서드로 "/member/save" 요청을 처리하는 메서드
  public String saveForm() {
    return "save";//"save"라는 문자열을 반환. 뷰 이름을 나타낸다. save.jsp로 연결됨.
  }
}
