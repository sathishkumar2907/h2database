package com.mycuteblog.service;

import java.util.List;

import com.mycuteblog.model.ApiRequest;

public interface ApiRequestService {
    void create(ApiRequest apiRequest);
    ApiRequest getApiRequestById(long id);
    public List<ApiRequest> queryForRequests();
}
