package com.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	
	//get olarak geldiðinde bu method çalýþacak.
    public String showHomePage(ModelMap map)
    {
		map.addAttribute("message", "hi");
    	return "home"; //yani home.jsp sayfasýný arayacak.
    }
}
