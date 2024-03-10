package com.study.erum.controller;

import javax.servlet.http.HttpSession;

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
  
  @GetMapping("login") //HTTP GET 메서드로 "/login" 요청을 처리하는 메서드이며, 사용자에게 로그인 폼을 제공
  public String loginForm() {
    return "login";
  }
  
  @PostMapping("/login")//HTTP POST 메서드로 "/login" 요청을 처리하는 메서드이며, 실제 로그인 기능을 수행
  //@ModelAttribute MemberDTO memberDTO는 HTTP 요청 파라미터를 MemberDTO 객체에 바인딩하기 위한 어노테이션
  //사용자가 입력한 로그인 정보를 MemberDTO 객체로 받아옵사용자가 입력한 로그인 정보를 MemberDTO 객체로 받아옴
  public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session) {

    // MemberService 클래스의 login 메서드를 호출하여 로그인을 시도하고 그 결과를 변수에 저장합니다.
    boolean loginResult = memberService.login(memberDTO);
    
    //로그인에 성공한 경우
    if (loginResult) {
      //HttpSession을 사용하여 로그인한 사용자의 정보를 세션에 저장
      session.setAttribute("loginEmail", memberDTO.getMemberEmail());
      return "main";//main이라는 뷰로 이동.
    }else {
      return "login"; //login 뷰로 이동.(jsp)
    }
  }
}
