package com.example.vo;

import lombok.Data;

// setter, getter 자동
@Data
public class NewsEntity {
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
}
