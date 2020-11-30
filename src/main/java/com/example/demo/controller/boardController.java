package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.NoticeEntity;
import com.example.demo.service.NoticeService;

@Controller
public class boardController {

	@Autowired
	NoticeService noticeService;
	
	
	@RequestMapping("/")
	public String homem(Model model) {
	List<NoticeEntity> list	= noticeService.noticelist();
	model.addAttribute("list",list);
	
		return "index";
	}
	
}
