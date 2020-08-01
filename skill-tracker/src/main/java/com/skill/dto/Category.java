package com.skill.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import lombok.Data;


public class Category {
	@NotNull
	public Integer categoryId;
	@Length(min = 5, max = 30)
	@NotNull
	public String category;
	
	
}
