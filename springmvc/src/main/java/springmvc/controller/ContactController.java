package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private  UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header", "Register for Spring MVC");
		m.addAttribute("Desc", "Fill the Form");
		System.out.println("add common data");
		
	}
	
	@RequestMapping("/contact")
	//show the registration form to the end user
	public String showForm(Model m)  
	{
		return "contact";
	}
	
	@RequestMapping(path ="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,  Model m)  
	{
		System.out.println(user);
		
		if(user.getName1().isBlank())
		{
			return "redirect:/contact";
		}
		int createUser=this.userService.createUser(user);
		m.addAttribute("msg", "new user created with id-"+createUser);
		return "success";
	}

}
/*        //Traditional way
@RequestMapping(path ="/processform", method=RequestMethod.POST)
public String handleForm(HttpServletRequest req)  //accept and store the data from end user
{
String email=req.getParameter("email1");
String name=req.getParameter("name1");
String psw=req.getParameter("psw1");
System.out.println("name:"+name+"|mail:"+email+"|psw:"+psw);
	return "";
}		*/

/*
@RequestMapping(path ="/processform", method=RequestMethod.POST)
			//Spring MVC way  using Requestparam annotation 
//accept and store the data from end user
//required =false is used for optional data field
public String handleForm( @RequestParam(name="email1",required =false)String mail,
						  @RequestParam("name1")String naam,
						  @RequestParam("psw1")String psw, Model model)  
{
	System.out.println("User name:"+naam);
	System.out.println("User mail:"+mail);
	System.out.println("User psw:"+psw);
	
	//====   here we can process the data like Store in DataBase....  ====
	
	model.addAttribute("User_Name", naam);
	model.addAttribute("User_Mail", mail);
	model.addAttribute("User_PSW", psw);
	return "success";
}         */
