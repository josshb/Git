package org.josem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.josem.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {

	@Autowired
	private UserService userService;

	private static final Logger logger = LoggerFactory.getLogger(homeController.class);

	@RequestMapping("/")
	public ModelAndView handleRequest() throws Exception {
		logger.info("listado");
		List<User> listUsers = userService.list();
		ModelAndView model = new ModelAndView();
		model.addObject("userList", listUsers);
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newUser() {
		logger.info("new");
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("user", new User());
	}

	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView editUser(HttpServletRequest request) {
		logger.info("edit");
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = userService.get(userId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addAllObjects("user", user);
		return model;

	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		logger.info("delete");
		int userId = Integer.parseInt("id");
		userService.delete(userId);
		return new ModelAndView("redirect:/");
	}
	@RequestMapping(value = "/save",method=RequestMethod.POST) 
	public ModelAndView saveUser(@ModelAttribute User user) {
		logger.info("save!!!");
		userService.add(user);
		return new ModelAndView("redirect:/");
	}
}
