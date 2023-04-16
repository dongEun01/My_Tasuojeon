package com.tsp.TARsProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class testController {
 
    @GetMapping("/")	
	public String test(Model d,Model s) {
    d.addAttribute("test","hello world");
    s.addAttribute("most","hellow");
    return "home/index";
		
	}
    
}
