package com.study.erum.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component

/*
 * return의 단점은 한번에 출력이 안되고 한개만 값을 반환 해준다는 것이다.
 * ToString어노테이션으로 사용함으로 인해서 여러개의 값을 패킹해서 한번에 받을 수 있게 해주는 것이다. 
 */
@ToString 
@Getter
public class SampleHotel {

  private Chef chef;
  
  //생성자 함수 
  public SampleHotel(Chef chef) {
    this.chef = chef;
  }
}
