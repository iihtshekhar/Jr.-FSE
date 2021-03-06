package com.skill.dto;


import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class SkillType {
	
	@NotNull
	public Integer skillTypeId;
	@Length(min = 5, max = 20)
	@NotNull
	public String skillTypeName;
}
