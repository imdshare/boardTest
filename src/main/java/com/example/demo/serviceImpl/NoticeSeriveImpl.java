package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NoticeDao;
import com.example.demo.entity.NoticeEntity;
import com.example.demo.service.NoticeService;



@Service
public class NoticeSeriveImpl implements NoticeService{

	@Autowired
	NoticeDao noticeDao;
	
	@Override
	public List<NoticeEntity> noticelist() {
		// TODO Auto-generated method stub
		return noticeDao.findAll();
	}
	
}
