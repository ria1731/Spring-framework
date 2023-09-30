package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.model.User;

@Controller
public class HomeController {
	
@RequestMapping("/contact")
public String showForm(Model model) {
	System.out.print("contact url");
	
	return "index";
}

@RequestMapping(path="/processform" , method= RequestMethod.POST)
public String handleForm(
		@RequestParam("email") String Uemail, 
		@RequestParam("name") String Uname,
		Model model)
{
	//System.out.print(email+" "+name);
	User user =new User();
	user.setEmail(Uemail);
	user.setName(Uname);
	System.out.print(user);
	model.addAttribute("user",user);
	//model.addAttribute("name",name);
	
	return "success";
}
	
}
