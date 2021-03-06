package com.skill.dto;


import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document

public class User {
	@Length(min = 5, max = 40)
	@NotNull
	private String firstName;
	@Length(min = 5, max = 40)
	@NotNull
	private String lastName;
	@Length(min = 5, max = 40)
	@NotNull
	private String email;
	@Length(min = 5, max = 40)
	@NotNull
	private long mobileNumber;
	
	

	
	
	
	
}
