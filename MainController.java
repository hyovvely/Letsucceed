package com.pillyo.pill.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pillyo.pill.model.BodyVO;
import com.pillyo.pill.model.FamilyVO;
import com.pillyo.pill.model.FeelVO;
import com.pillyo.pill.service.BodyService;
import com.pillyo.pill.service.FamilyService;
import com.pillyo.pill.service.FeelService;

@Controller
public class MainController {
	@Autowired
	FamilyService service;
	@Autowired
	BodyService Bservice;
	@Autowired
	FeelService Fservice;
	
	
	@RequestMapping("/")
	public String index() {
		return "/index";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "/join";
	}
	
//	@RequestMapping("/dashboard")
//	public String dashboard() {
//		return "/Main/dashboard";
//	}

	@RequestMapping(value = {"/dashboard","/famListView" ,"/listAllBody"})
	public String dashboard(Model model) {
		ArrayList<BodyVO> bodyList = Bservice.listAllBody();
		model.addAttribute("bodyList", bodyList);
		
		ArrayList<FamilyVO> famList = service.famListView();
		model.addAttribute("famList", famList);	
		
		return "/Main/dashboard";
	}
	
		
}
