package com.skill.entitys;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private long mobileNumber;
	
	
	
}
