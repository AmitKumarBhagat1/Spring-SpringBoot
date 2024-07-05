package springmvcSearch.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;



@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("Home page loaded......");
		return "home";
	}
	
	
	  @RequestMapping("/search")
	  public RedirectView search(@RequestParam("querybox")String query) 
	  { 
		  String url="https://www.google.com/search?q="+query; 
		  RedirectView re=new RedirectView(); 
		  if(query.isBlank())
		  {
			  System.out.println("Home page Reloaded......");
			  re.setUrl("error");
			  return re;
		  }
		  else {
			  re.setUrl(url); 
			  return re;
		} 
	  }
	 
	@RequestMapping("/error")
	public String error()
	{
		System.out.println("Home page Reloaded......");
		return "error";
	}
	

}
