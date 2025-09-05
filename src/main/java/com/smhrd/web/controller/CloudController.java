package com.smhrd.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smhrd.web.domain.Cloudtest;
import com.smhrd.web.repo.CloudtestRepository;

@Controller
public class CloudController {
	
	@Autowired
	private CloudtestRepository repo;
	// find로 시작하면 select를 사용하겠다! (All : 전체)
	@GetMapping("/")
	public String goIndex(Model model) {
		List<Cloudtest> list = repo.findAll();
		model.addAttribute("list", list);
		System.out.println(list.size());
		return "index";
	}

}
