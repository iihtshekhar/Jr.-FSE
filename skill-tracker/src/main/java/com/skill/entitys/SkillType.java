package com.skill.entitys;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
public class SkillType {
	@Id
	public Integer skillTypeId;
	public String skillTypeName;
}
