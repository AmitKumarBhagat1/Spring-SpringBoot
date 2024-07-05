package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;


//there are two way to Redirect page using Spring
//============>redirect prefix
//============>RedirectView class
@Controller
public class ReController {
	
	@RequestMapping("/error")
	public RedirectView  error() {
		RedirectView re=new RedirectView();
		re.setUrl("two");
		return re;
	}
@RequestMapping("/two")
public String two()
{
	return "redirect:/joy";
}
	@RequestMapping("/joy")
public String three()
{
	return "about";
}	
}
