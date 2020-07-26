package com.zachary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zachary.data.SpittleRepository;

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

	@RequestMapping(value="/{count}", method = RequestMethod.GET)
	public String spittle(@PathVariable("count") int count, Model model) {
		model.addAttribute("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, count));
		return "spittles";
	}

	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		super();
		this.spittleRepository = spittleRepository;
	}
}
