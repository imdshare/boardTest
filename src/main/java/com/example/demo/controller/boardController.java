package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.NoticeEntity;
import com.example.demo.service.NoticeService;


@Controller
public class boardController {

	@Autowired
	NoticeService noticeService;
	
	
	@RequestMapping("/")
	public String home(Model model) {
		List<NoticeEntity> list = noticeService.noticelist();
		model.addAttribute("list", list);

		return "index";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		List<NoticeEntity> list = noticeService.noticelist();
		model.addAttribute("list", list);
		
		return "index";
	}
//	@GetMapping
//	public String home(Model model) {
//	List <NoticeEntity> list=noticeService.noticelist();
//	if(list != null)
//	model.addAttribute("list",list);
//
//	return "index";
//	}
	
	
//	private static final Logger logger = LoggerFactory.getLogger(boardController.class);
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//		logger.info("Welcome home!");
//		
//		return "index";
//	}
}
