package kr.ac.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import kr.ac.dit.domain.StudentVO;

@Controller
public class StudentController {
	@RequestMapping("read")
	public void read(Model model) {
		StudentVO studentVO = new StudentVO();
		studentVO.setNo("201412387");
		studentVO.setName("PARK HYEON JU");
		model.addAttribute(studentVO);
	}
//
}
