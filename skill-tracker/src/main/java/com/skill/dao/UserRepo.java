package com.skill.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.skill.dto.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
	
	@Query
	public List<User> findByFirstName(String firstName);
	@Query
	public User findByEmail(String email);
	@Query
	public User findByMobileNumber(long mobile);
	
	@Query("{'skills.skillCategory.category':?0}")
	public List<User> findByCategory(String team);
	
	@Query("{'teamName.teamName':?0}")
	public List<User> findByTeamName(String teamName);
	
	@Query("{'skills.skillType.skillTypeName':?0}")
	public List<User> findBySkillType(String skillType);
	
	@Query("{'skills.skillValue' : {$lt : ?1, $gt : ?0}}")
	public List<User> findBySkillRange(int min, int max);
	
	@Query("{'skills.skillValue' : {$lt : 20, $gt : 13}}")
	public List<User> findByExpertLevel();
	
	@Query("{'skills.skillValue' : {$lt : 5, $gt : 0}}")
	public List<User> findByBeginnerLevel();
	
	@Query("{'skills.skillValue' : {$lt : 12, $gt : 6}}")
	public List<User> findByIntermediateLevel();
}
