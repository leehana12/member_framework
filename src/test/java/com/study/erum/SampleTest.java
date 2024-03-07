package com.study.erum;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.study.erum.sample.Restaruant;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
//배포판을 만들때 test폴더에 있는 것은 제외 되기 떄문에 여기서 test해보는 것이다.
public class SampleTest {

  @Autowired
  private Restaruant restaruant;
  
  @Test
  public void testExist() {
    assertNotNull(restaruant);
    
    //system.out보다 log.info가 좋은 이유- 개발할떄는 info에 맞추고 제품을 바꾸고 제품을 출하할떄는 워닝으로 변경하면 안보인다.
    log.info(restaruant);
    log.info("----------------------------------------");
    log.info(restaruant.getChef());
  }
  
  
}




