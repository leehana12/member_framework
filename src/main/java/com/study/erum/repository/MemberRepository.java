package com.study.erum.repository;

import lombok.RequiredArgsConstructor;

import java.util.List;

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

  public List<MemberDTO> findAll() {
    // MyBatis를 사용하여 모든 회원의 정보를 데이터베이스에서 가져온 후 리스트로 반환
    return sql.selectList("Member.findAll");
  }

  public MemberDTO findById(Long id) {
    // MyBatisdml SelectOne()메서드로 id값으로 회원정보 반환
    return sql.selectOne("Member.findById", id);
  }
}