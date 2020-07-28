package com.skill.service;

import java.util.List;

import com.skill.dto.User;

public interface UserService {
	public List<User> getAllUser();
	public List<User> getByFirstName(String firstName);
	public User getByEmail(String email);
	public User getByMobileNumber(long mobile);
	public List<User> getByTeamName(String team);
	public List<User> getByCategory(String category);
	public List<User> getBySkillType(String category);
	public List<User> getByRange(int start, int end);
	public long getCountByExpertSkill();
	public long getCountByIntermediateSkill();
	public long getCountByBeginnerSkill();
	public long getCountCategories();
	public long getCountTeams();
	
	public User createUser(User user);
	public User updateUser(User user);
	public void deleteUser(int userId);
}
