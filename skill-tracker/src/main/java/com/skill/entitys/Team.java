package com.skill.entitys;

import org.springframework.data.annotation.Id;
import com.skill.entitys.*;

import lombok.Data;

@Data
public class Team {
	@Id
	public Integer teamId; 
	public String teamName;
	public Domain domain;
}