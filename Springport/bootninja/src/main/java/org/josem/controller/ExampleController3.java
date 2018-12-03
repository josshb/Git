package org.josem.controller;

import org.josem.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/example3")
public class ExampleController3 {

	public static final String SHOW_FORM = "form";
	public static final String VIEW_RESULT = "result";

//	@GetMapping("")
//	public String redirect() {
//		
//		return "redirect:/example3/showform";
//		
//	}
//	
	@GetMapping("")
	public RedirectView redirect() {
		return new RedirectView("example3/showform");
	}
	
	@GetMapping("/showform")
	public String showForm(Model model) {
		model.addAttribute("person", new Person());
		return SHOW_FORM;
	}

	@PostMapping("/addperson")
	public ModelAndView addPerson(@ModelAttribute("person") Person person) {
		ModelAndView mw = new ModelAndView(VIEW_RESULT);
		mw.addObject("person", person);
		return mw;
	}

}
