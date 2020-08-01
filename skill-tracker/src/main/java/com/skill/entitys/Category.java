package com.skill.entitys;

import org.springframework.data.annotation.Id;

import lombok.Data;


public class Category {
	@Id
	public Integer categoryId;
	public String category;
}
