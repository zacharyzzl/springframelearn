package com.zachary.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zachary.data.SpittleRepository;
import com.zachary.vo.Spittle;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	private SpittleRepository spittleRepository;

	@RequestMapping(method = RequestMethod.GET)
	public String spittles(@RequestParam(value = "max", defaultValue = "1000") long max,
			@RequestParam(value = "count", defaultValue = "20") int count, Model model) {
		model.addAttribute("spittleList", spittleRepository.findSpittles(max, count));
		return "spittles";
	}

	@RequestMapping(value="/spittle/{count}", method = RequestMethod.GET)
	public String spittle(@PathVariable("count") int count, Model model) {
		model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, count));
		return "spittles";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String showRegistrationForm() {
		return "registerForm";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String processRegistration(@Valid Spittle spittle, Errors errors) {
		System.out.println(spittle);
		if(errors.hasErrors()) {
			return "registerForm";
		}
		return "redirect:/spittles/processRegistration/" + spittle.getUsername();
	}
	
	@RequestMapping(value="/processRegistration/{username}", method = RequestMethod.GET)
	public String processRegistration(@PathVariable("username") String username, Model model) {
		Spittle spittle = new Spittle();
		spittle.setUsername(username);
		model.addAttribute(spittle);
		return "profile";
	}
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		super();
		this.spittleRepository = spittleRepository;
	}
}
