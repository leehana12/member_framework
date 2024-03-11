package com.study.erum.service;

import org.springframework.stereotype.Service;

import com.study.erum.dto.MemberDTO;
import com.study.erum.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

//final이 붙은 변수에 대한 생성자를 자동으로 생성
//회원과 관련된 비즈니스 로직을 처리하기 위한 서비스 클래스
@Service
@RequiredArgsConstructor //생성자방식
public class MemberService {
  
  private final MemberRepository memberRepository;

  //회원정보를 저장하는 메서드
  public int save(MemberDTO memberDTO) {
    return memberRepository.save(memberDTO);
  }

  // 회원 로그인을 처리하는 메서드
  public boolean login(MemberDTO memberDTO) {
    // MemberRepository를 통해 로그인을 시도하고 그 결과를 반환
    MemberDTO loginMember = memberRepository.login(memberDTO);
    
    if (loginMember != null) {// 로그인에 성공한 경우
      return true;
    } else {// 로그인에 실패한 경우.
      return false;
    }
  }



  
}
