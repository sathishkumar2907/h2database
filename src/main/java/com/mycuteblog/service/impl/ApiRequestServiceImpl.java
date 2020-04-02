package com.mycuteblog.service.impl;

import com.mycuteblog.dao.ApiRequestDao;
import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.service.ApiRequestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApiRequestServiceImpl implements ApiRequestService {

    @Autowired
    private ApiRequestDao apiRequestDao;

	public void create(ApiRequest apiRequest) {
		apiRequestDao.save(apiRequest);
	}

	public ApiRequest getApiRequestById(long id) {
		return apiRequestDao.findOne(id);
	}

	public List<ApiRequest> queryForRequests() {
		return apiRequestDao.findAll();
	}

   
}
