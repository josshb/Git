package org.josem.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/example2")
public class Example2Controller {
	private static final String REQUEST_VIEW="request2";
	
	
	@GetMapping("/example2b")
	public ModelAndView request1(@RequestParam(name="nm",required=false,defaultValue="null") String name) {
		ModelAndView mw = new ModelAndView(REQUEST_VIEW);
		mw.addObject("nm_model", name);
		return mw;
		
	}
	@GetMapping("/example2c/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mw = new ModelAndView(REQUEST_VIEW);
		mw.addObject("nm_model", name);
		return mw;
	}
}
