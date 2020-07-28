package com.skill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skill.dto.User;
import com.skill.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/adduser")
	public User createUser(@RequestBody User user)
	{
		return userService.createUser(user);
	}
	
	@GetMapping("/getusers")
	public List<User> getAllUsers()
	{
		return userService.getAllUser();
	}
	
	@GetMapping("/getUserFirstName/{firstName}")
	public ResponseEntity<List<User>> getUserByFirstName(@PathVariable("firstName") String firstName)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getByFirstName(firstName));
	}
	
	@GetMapping("/getUserEmail/{email}")
	public ResponseEntity<User> getUserByEmail(@PathVariable("email") String email)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getByEmail(email));
	}
	
	@GetMapping("/getUserMobile/{mobileNo}")
	public ResponseEntity<User> getUserByMobileNo(@PathVariable("mobileNo") Long mobileNo)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getByMobileNumber(mobileNo));
	}
	

	@GetMapping("/getUserByCategory/{category}")
	public ResponseEntity<List<User>> getUserByCategory(@PathVariable("category") String category)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getByCategory(category));
	}
	
	@GetMapping("/getUserByTeamName/{teamName}")
	public ResponseEntity<List<User>> getUserByTeamName(@PathVariable("teamName") String teamName)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getByTeamName(teamName));
	}
	
	@GetMapping("/getUserByRange/{min}/{max}")
	public ResponseEntity<List<User>> getUserByRange(@PathVariable("min") int min, @PathVariable("max") int max)
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getByRange(min, max));
	}
	
	@GetMapping("/getCountByExpertLevel")
	public ResponseEntity<Long> getCountOfExpertLevel()
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getCountByExpertSkill());
	}
	
	@GetMapping("/getCountByIntermediateLevel")
	public ResponseEntity<Long> getCountOfIntermediateLevel()
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getCountByIntermediateSkill());
	}
	
	@GetMapping("/getCountByBeginnerLevel")
	public ResponseEntity<Long> getCountOfBeginnerLevel()
	{
		return ResponseEntity.status(HttpStatus.OK).body(userService.getCountByBeginnerSkill());
	}
}
