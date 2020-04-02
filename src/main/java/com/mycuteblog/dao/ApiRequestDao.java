package com.mycuteblog.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycuteblog.model.ApiRequest;

public interface ApiRequestDao extends JpaRepository<ApiRequest, Long>{
	
}
