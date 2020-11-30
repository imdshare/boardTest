package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;

import lombok.Data;


@Data
@Entity
public class NoticeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idx ;

	@Column(name="noticeNo")
	private String noticeNo ;

	@Column(name="title")
	private String title ;

	@Column(name="contents")
	private long contents ;

	@CreatedDate
	private LocalDateTime regDt ;
}
