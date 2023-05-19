package com.example.demo;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController 
{
	@Autowired
	UserDao dao;  
	@Autowired
	DetailsDao dao1;
	
	
	@RequestMapping("/")  

	public String index()
	{
		return "index";
		
	}
	/*
	 * @RequestMapping("/") public String register() { return "register"; }
	 */
	 
	
	@RequestMapping("/home")  // localhost:8081/home
	public String home(HttpServletRequest req,Model m)
	{
		String usern=req.getParameter("username");
		String pass=req.getParameter("passwrd");
		boolean un=dao.existsByUsername(usern);
		boolean passw=dao.existsByPasswrd(pass);
		if(un==true && passw==true)
		{
		return "home";
		}
		else
		{
			String msg1= "Invalid Credentials";
			m.addAttribute("message",msg1);
			return "index";
			
		}
		
	}
	
	
	@RequestMapping("/create")
	public String create()
	{
		return "create";
	}
	
	@RequestMapping("/save")
	public String save(Details details,Model m)
	{
		dao1.save(details);
		String msg1= "Details has been sucessfully saved";
		m.addAttribute("message",msg1);
		
		return "create";
	}
	
	@RequestMapping("/show")
	public String getshow()
	{
		return "showdetails";
	}

	@RequestMapping("/showdetails")
	public ModelAndView show(@RequestParam String projectname  )
	{
		ModelAndView mv=new ModelAndView("showdetails");
		Details details =dao1.findById(projectname).orElse(new Details());
		
		System.out.println(details);
		mv.addObject(details);
		return mv;
		
	}
	
	@RequestMapping("/Logout")
	public String logout()
	{
		return "index";
	}
	
      @RequestMapping("/main")
      public String main() 
  {
	return "home";
  }
	
      @RequestMapping("/mainshow")
      public String mainshow() 
  {
	return "home";
  }
      
      // uncommented bias  
      
		/*
		 * @RequestMapping("/app") public String app1() { return "home"; }
		 * 
		 */
  
  


}






      
      

	

