package com.study.erum.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class Restaruant {

  @Autowired //의존관계 주입(DI) / 스프링 관련 어노테이션. 변수를 주입할 떄 사용한다.
  private Chef chef;
  
}
