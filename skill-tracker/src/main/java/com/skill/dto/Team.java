package com.skill.dto;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Team {
	@Id
	public Integer teamId; 
	public String teamName;
	public Domain domain;
}