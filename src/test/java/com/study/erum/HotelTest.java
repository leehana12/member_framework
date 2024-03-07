package com.study.erum;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.erum.sample.SampleHotel;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class HotelTest {

  @Autowired
  private SampleHotel hotel;
  
  @Test
  public void testExist() {
    assertNotNull(hotel);
    
    //system.out보다 log.info가 좋은 이유- 개발할떄는 info에 맞추고 제품을 바꾸고 제품을 출하할떄는 워닝으로 변경하면 안보인다.
    log.info(hotel);
    log.info("----------------------------------------");
    log.info(hotel.getChef());
  }  
}
