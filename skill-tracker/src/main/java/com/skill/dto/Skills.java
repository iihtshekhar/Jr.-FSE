package com.skill.dto;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Skills {

	private String skillName;
	private int skillValue;
	private String skillLevel;
	private String remark;
	
	
	
	private Category skillCategory;
	
	private SkillType skillType;
	private int skillExperience;
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
	
}
