package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String Home(Model model)
	{
		System.out.println("This is Home Controller....");
		model.addAttribute("name","Amit Kr.");
		model.addAttribute("id", 121);
		List<String> address=new ArrayList<String>();
		address.add("Shivram ");
		address.add("Darbhanga ");
		address.add("Bihar");
		
		model.addAttribute("address", address);
		return "index";
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is About Controller....");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("This is Help controller......");
		//Creating ModelAndView Object
		ModelAndView mv=new ModelAndView();
		//Setting the Data
		mv.addObject("name", "Kuttapa");
		mv.addObject("roll", 123);
		LocalDateTime time=LocalDateTime.now();
		mv.addObject("time", time);
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(54);
		marks.add(78);
		marks.add(91);
		mv.addObject("mark", marks);
		//Setting view page
		mv.setViewName("help");
		return mv;
	}

}
