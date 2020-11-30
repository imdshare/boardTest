package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.NoticeEntity;


public interface NoticeDao extends JpaRepository<NoticeEntity, Long> {

}
