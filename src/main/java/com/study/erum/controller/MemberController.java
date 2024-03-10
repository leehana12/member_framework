package com.study.erum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.erum.dto.MemberDTO;
import com.study.erum.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/member")// 이 컨트롤러의 모든 요청은 "/member"로 시작
@RequiredArgsConstructor
public class MemberController {
  
  private final MemberService memberService;
  
  @GetMapping("/save")// HTTP GET 메서드로 "/member/save" 요청을 처리하는 메서드
  public String saveForm() {
    return "save";//"save"라는 문자열을 반환. 뷰 이름을 나타낸다. save.jsp로 연결됨.
  }
  
  @PostMapping("/save")
  public String save(@ModelAttribute MemberDTO memberDTO) {
    
    // MemberService 클래스의 save 메서드를 호출하여 회원 정보를 저장하고 그 결과를 변수에 저장합니다.
    int saveResult = memberService.save(memberDTO);
    if(saveResult > 0) {// 저장에 성공한 경우
      return "login"; //login페이지로 이동
    } else { //저장에 실패한 경우
      return "save"; //회원가입 폼으로 이동
    }
    
  }
}
