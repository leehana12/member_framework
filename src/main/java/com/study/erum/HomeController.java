package com.study.erum;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *Handles requests for the application home page. 
 *애플리케이션 홈페이지에 대한 요청을 처리
 */
@Controller
public class HomeController {

  //slf4j방식으로 import함. 로그 기능을 사용하기 위한 인터페이스. LoggerFactory는 Logger객체를 생성하기 위한 팩토리 클래스
  private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);

  /**
   * Simply selects the home view to render by returning its name.
   * 뷰의 이름을 반환하여 해당 뷰를 렌더링 하도록 Spring에 지시
   */
  @RequestMapping(value = "/", method = RequestMethod.GET)// '/'경로로 GET 요청이 들어올 경우에 이 메서드가 처리하도록 지정
  /*
   *Locale과 Model 은 스프링 프레임워크에서 주로 사용되는 두가지 클래스 이다.
   *  Locale = 지역정보를 나타낸다(언어,국가 및 지역 설정을 포함). 다국어 지원을 위해 사용, 서로다른 지역에 있는 사용자들에게 적절할 언어 및 형식을 제공하기 위해 사용.
   *  Model = 스프링 MVC에서 컨트롤러에서 뷰로 데이터를 전달하는데 사용.  
   */
  public String home(Locale locale, Model model) {// jsp파일의 이름이 home이여야만 호출가능
    Logger.info("welcome home! the client locale is {}.", locale);//로그 출력. 클라이언트의 로캘 정보를 포함한 메시지를 출력
    
    //Date import는 util로 함.
    Date date = new Date();//현재 날짜와 시간을 가져온다.
    DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);//현재 로케일에 맞는 날짜와 시간 포맷을 가져옴.
    
    String formattedDate = dateFormat.format(date);//날짜와 시간을 형식화하여 문자열로 저장
    
    model.addAttribute("serverTime", formattedDate);//'serverTime'이라는 이름으로 형식화된 날짜와 시간을 모델에 추가.
    
    return "home";//리턴해더 HomeController로 값을 넣어주면 servlet-context.xml 파일에서 받아서 jsp를 연결해 준다. home.jsp 뷰가 렌더링 됨.
  }


}
