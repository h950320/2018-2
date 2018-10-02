package kr.ac.dit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.dit.domain.StudentVO;
@Controller
public class SampleController3 {
 @RequestMapping("/urlD")
 public String urlD(Model model){
  StudentVO studentVO = new StudentVO(); 
  studentVO.setNo("201412387");
  studentVO.setName("박 현 주");
  model.addAttribute(studentVO);
  return "read";
 }
}