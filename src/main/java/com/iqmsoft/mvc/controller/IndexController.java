package com.iqmsoft.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iqmsoft.mvc.entity.Message;

@Controller
public class IndexController {

	@Autowired
	private Message message;

	@RequestMapping("/")
	public String home(Model model) {
   
		model.addAttribute("pageHeader", message.getHomePageHeader());
		model.addAttribute("pageContent", message.getHomePageContent());
		model.addAttribute("h1pageHeader", message.getH1pageHeader());
		return "views/home";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		
		return "views/about";
	}

}
