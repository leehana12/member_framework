package com.study.erum.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//(Data Transfer Object)-데이터 전송 객체. 비즈니스 로직과 데이터베이스 사이에서 데이터를 전송하는 데 사용,요청데이터를 담고있는객체
//- 주의 사항 : DTO 변수와 save.jsp에 있는 name이 반드시 일치해야 @ModelAttribue를 사용 가능
public class MemberDTO {
  private Long id; // Long 타입은 64비트(=8바이트) 정수 
  private String memberEmail;
  private String memberPassword;
  private String memberName;
  private int memberAge; // int 타입은 32비트(4바이트) 정수.
  private String memberMobile;
}
