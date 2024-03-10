package com.study.erum.service;

import org.springframework.stereotype.Service;

import com.study.erum.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor//final이 붙은 변수에 대한 생성자를 자동으로 생성
//회원과 관련된 비즈니스 로직을 처리하기 위한 서비스 클래스
public class MemberService {
  
  //MemberRepository 타입의 필드를 선언하고, @RequiredArgsConstructor에 의해 자동 생성된 생성자를 통해 주입
  private final MemberRepository memberRepository;
  
}
