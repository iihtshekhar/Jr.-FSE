package com.skill.utilityclasses;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.skill.dto.Skills;

public class MasterData {

	public static Skills getuser() {

		Skills skill = new Skills();
		skill.setSkillName("Java");
		skill.setSkillValue(5);
		skill.setSkillLevel("Good");
		skill.setRemark("Nice");
		skill.setSkillExperience(20);
		
		return skill;
	}
	
	
	public static String asJsonString(final Object obj) {
	    try {
	        final ObjectMapper mapper = new ObjectMapper();
	        final String jsonContent = mapper.writeValueAsString(obj);
	        return jsonContent;
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}


	public static Skills getSkills() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
