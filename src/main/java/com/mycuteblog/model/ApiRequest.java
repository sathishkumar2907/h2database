package com.mycuteblog.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "api_request")
public class ApiRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="request_time")
    private Date requestTime;
    
    @Column(name="name")
    private String name;


    public ApiRequest() {
    }

    public ApiRequest(Date requestTime) {
        this.requestTime = requestTime;
    }
    
    

    public ApiRequest(Date requestTime, String name) {
		super();
		this.id = id;
		this.requestTime = requestTime;
		this.name = name;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
