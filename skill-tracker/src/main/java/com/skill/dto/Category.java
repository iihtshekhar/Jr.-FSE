package com.skill.dto;

import org.springframework.data.annotation.Id;

import lombok.Data;


public class Category {
	@Id
	public Integer categoryId;
	public String category;
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
