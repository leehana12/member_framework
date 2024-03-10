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
    return sql.insert("Member.save", memberDTO);//Member 매퍼에서 save라는 아이디를 가진 쿼리를 실행하라는 의미
  }
}
