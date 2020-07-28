package com.skill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.skill.dao.UserRepo;
import com.skill.dto.User;

@Service
@EnableTransactionManagement
@EnableAutoConfiguration
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	@Autowired
	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

	@Override
	public List<User> getByFirstName(String firstName) {
		return userRepo.findByFirstName(firstName);
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepo.findByEmail(email);
		}

	@Override
	public User getByMobileNumber(long mobile) {
		return userRepo.findByMobileNumber(mobile);
	}

	@Override
	public List<User> getByTeamName(String team) {
		// TODO Auto-generated method stub
		return userRepo.findByTeamName(team);
		
	}

	@Override
	public List<User> getByCategory(String category) {
		// TODO Auto-generated method stub
		return userRepo.findByCategory(category);
		
	}

	@Override
	public List<User> getBySkillType(String category) {
		// TODO Auto-generated method stub
		return userRepo.findBySkillType(category);
		
	}

	@Override
	public List<User> getByRange(int start, int end) {
		// TODO Auto-generated method stub
		return userRepo.findBySkillRange(start, end);
	}

	@Override
	public long getCountByExpertSkill() {
		// TODO Auto-generated method stub
		 return userRepo.findByExpertLevel().size();
	}

	@Override
	public long getCountByIntermediateSkill() {
		// TODO Auto-generated method stub
		return userRepo.findByIntermediateLevel().size();
	}

	@Override
	public long getCountByBeginnerSkill() {
		// TODO Auto-generated method stub
		return userRepo.findByBeginnerLevel().size();
	}

	@Override
	public long getCountCategories() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getCountTeams() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		//userRepo.deleteById(userId);
	}

}
