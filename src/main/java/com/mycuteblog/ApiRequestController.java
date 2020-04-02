package com.mycuteblog;

import com.mycuteblog.model.ApiRequest;
import com.mycuteblog.service.ApiRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
@RestController
@EnableAutoConfiguration
public class ApiRequestController {

    @Autowired
    private ApiRequestService apiRequestService;

    private static final Logger logger = LoggerFactory.getLogger(ApiRequestController.class);
    
    @RequestMapping(value="/save",produces="application/json")
	public Map<String, Object> save(@RequestBody ApiRequest apiRequest){
    	logger.info("Ready to sent the Api request");
		Map<String, Object> response=new HashMap<String, Object>();
		
		 apiRequest.setRequestTime(apiRequest.getRequestTime());
		 apiRequest.setName(apiRequest.getName());
		 
         apiRequestService.create(apiRequest);
		response.put("data",apiRequest);
		response.put("message","success" );
		return response;
	}

    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> getHome() {
        logger.info("Api request received");

        Map<String, Object> response = new HashMap<String, Object>();
        try {
            
        	response.put("status2", apiRequestService.getApiRequestById(33));
            response.put("status3", apiRequestService.queryForRequests());
            
        } catch (Exception e) {
            logger.error("Error occurred while trying to process api request", e);
            response.put("status", "fail");
        }

        return response;
    }
}
