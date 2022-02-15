package com.pillyo.pill.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pillyo.pill.model.BodyVO;
import com.pillyo.pill.model.FamilyVO;
import com.pillyo.pill.service.BodyService;
import com.pillyo.pill.service.FamilyService;

@Controller
public class BodyController {
	@Autowired
	BodyService service;
	
	@Autowired
	FamilyService Fservice;
	
	// 체형관리 등록 폼으로 이동
	@RequestMapping("/bodyForm")
	public String bodyForm() {
		return "body/bodyForm";
	}
	// 체형 관리 정보 등록
	@RequestMapping("/insertBody")
	public String insertBody(BodyVO vo) {
		service.insertBody(vo);
		return "redirect:/listAllBody";  
	}
//	// 체형 관리 정보 조회
//	@RequestMapping("/listAllBody")
//	public String listAllBody(Model model) {
//		ArrayList<BodyVO> bodyList = service.listAllBody();
//		model.addAttribute("bodyList", bodyList);
//		return "body/bodyListView";
//	}
	
		// 체형 관리 정보 조회
		@RequestMapping(value = {"/famListView" ,"/listAllBody"})
		public String listAllBody(Model model) {
//			if(request.getServletPath().equals("/famListView")) {
//				ArrayList<BodyVO> bodyList = service.listAllBody();
//				model.addAttribute("bodyList", bodyList);
//			} else if(request.getServletPath().equals("/listAllBody")) {
//				ArrayList<FamilyVO> famList = Fservice.famListView();
//				model.addAttribute("famList", famList);	
//			}
			ArrayList<BodyVO> bodyList = service.listAllBody();
			model.addAttribute("bodyList", bodyList);
			
			ArrayList<FamilyVO> famList = Fservice.famListView();
			model.addAttribute("famList", famList);	
			
			return "body/bodyListView";
		}
		// 체형 관리 상세 정보 조회
		@RequestMapping("/bodyDetailView/{bodyNo}")
		public String bodyDetailView(@PathVariable int bodyNo, Model model) {
			BodyVO bodyVo = service.bodyDetailView(bodyNo);
			model.addAttribute("bodyVo", bodyVo);
			
			return "/body/bodyDetailView";
		}
	
	
	// 체형 관리 정보 삭제
	@RequestMapping("/deleteBody/{bodyNo}")
	public String deleteBody(@PathVariable int bodyNo) {
		System.out.println(bodyNo);
		service.deleteBody(bodyNo);
		return "redirect:../listAllBody";
	}
	//체형 관리 정보 업데이트 폼 이동
		@RequestMapping("/updateBodyForm/{bodyNo}")
		public String updateBodyForm(@PathVariable int bodyNo, Model model) {
			BodyVO body = service.detailViewBody(bodyNo);
			model.addAttribute("body", body);
			return "body/updateBodyForm";
	}
	//체형 관리 정보 업데이트
	@RequestMapping("/updateBody")
	public String updateBody(BodyVO vo) {
		service.updateBody(vo);
		return "redirect:/listAllBody";  
	}
}
