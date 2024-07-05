package springmvcSearch.complexForm_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcSearch.complexForm_service.StudentService;
import springmvcSearch.entity.Student;

@Controller
public class FormController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/complex")
	public String show()
	{
		return "complex_form";
	}
	@RequestMapping(path="/registerform",method=RequestMethod.POST)
	public String registerForm(@ModelAttribute Student student, Model m)
	{
		System.out.println(student);
		//int createStd=this.studentService.createStudent(student);
		//m.addAttribute("msg", "new user created with id-"+createStd);
		return "success";
	}

}
