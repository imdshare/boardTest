package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="notice")
public class NoticeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idx ;

	@Column(name="title")
	private String title ;

	@Column(name="contents")
	private long contents ;
	
	@Column(name="writer")
	private String writer ;
	
	@Column(name="regDt")
	private String regDt ;
}
