package org.josem.controller;

import java.util.ArrayList;
import java.util.List;

import org.josem.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hola")
public class HelloWorldController {

	public static final String HELLOWORLD_VIEW = "helloworld" ;

	@GetMapping("/example")
	public String exampleString(Model model) {
		model.addAttribute("people", getPeople());
		return HELLOWORLD_VIEW;
	}

	@GetMapping("/example1")
	public ModelAndView exampleMAV() {
		ModelAndView mav = new ModelAndView(HELLOWORLD_VIEW);
		mav.addObject("people", getPeople());
		return mav;

	}

	private List<Person> getPeople(){
		List<Person> people=new ArrayList<>();
			people.add(new Person("paco", 29));
			people.add(new Person("ernesto", 19));
			return people;
	}
}
