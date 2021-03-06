package com.skill.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Skills {

	@Length(min = 5, max = 20)
	@NotNull
	private String skillName;
	
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getSkillValue() {
		return skillValue;
	}
	public void setSkillValue(int skillValue) {
		this.skillValue = skillValue;
	}
	public String getSkillLevel() {
		return skillLevel;
	}
	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Category getSkillCategory() {
		return skillCategory;
	}
	public void setSkillCategory(Category skillCategory) {
		this.skillCategory = skillCategory;
	}
	public SkillType getSkillType() {
		return skillType;
	}
	public void setSkillType(SkillType skillType) {
		this.skillType = skillType;
	}
	public int getSkillExperience() {
		return skillExperience;
	}
	public void setSkillExperience(int skillExperience) {
		this.skillExperience = skillExperience;
	}
	@NotNull
	private int skillValue;
	@Length(min = 2, max = 20)
	@NotNull
	private String skillLevel;
	@Length(min = 5, max = 40)
	@NotNull
	private String remark;
	@Length(min = 5, max = 40)
	@NotNull
	private Category skillCategory;
	@Length(min = 5, max = 40)
	@NotNull
	private SkillType skillType;
	@Length(min = 5, max = 40)
	@NotNull
	private int skillExperience;
	
}
