package com.skill.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Team {

	@Length(min = 5, max = 30)
	@NotNull
	public Integer teamId; 
	@Length(min = 5, max = 40)
	@NotNull
	public String teamName;
	@Length(min = 5, max = 40)
	@NotNull
	public Domain domain;
}