package com.study.erum.repository;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.study.erum.dto.MemberDTO;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

  private final SqlSessionTemplate sql;

  public int save(MemberDTO memberDTO) {
    System.out.println("memberDTO = " + memberDTO);
    return sql.insert("Member.save", memberDTO);
  }

  // 회원 로그인을 시도하는 메서드
  public MemberDTO login(MemberDTO memberDTO) {
    //SqlSessionTemplate을 사용하여 mybatis의 selectOne 메서드를 호출하여 로그인 시도
    return sql.selectOne("Member.login", memberDTO);// MyBatis를 사용하여 member.login 쿼리를 실행하고 결과 반환
  }
}