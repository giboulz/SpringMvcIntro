package com.gbz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gbz.model.Exercise;




@Controller
public class MinutesController {

	@RequestMapping(value = "/addMinutes")
	//@ModelAttribute : Get / Post / work with pojo . Le nom doit matcher celui donner dans la jsp
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("exercise: " + exercise.getMinutes());
		exercise.setMinutes(20);
		//le forwar: renvoi sur une autre url
		//return "forward:addMoreMinutes.html";
		//redirect close la req et en ouvre une autre.
		//return "redirect:addMoreMinutes.html";
		return "addMinutes";
	}
	
	@RequestMapping(value = "/addMoreMinutes")
	//@ModelAttribute : Get / Post / work with pojo . Le nom doit matcher celui donner dans la jsp
	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise) {
		
		System.out.println("exercise more minutes: " + exercise.getMinutes());
		exercise.setMinutes(30);
		return "addMinutes";
	}
	
}
