package com.skill.boundarytestcases;

import static com.skill.utilityclasses.TestUtils.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.junit4.SpringRunner;

import com.skill.utilityclasses.MasterData;
import com.skill.dto.*;

@RunWith(SpringRunner.class)
public class EntityValidationTest {

	private Validator validator;

	@Before
	public void setUp() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		validator = factory.getValidator();
	}

	@Test
	public void testSkillTrackerSuccess() throws Exception {

		Skills details = MasterData.getSkills();
		Set<ConstraintViolation<Skills>> violations = validator.validate(details);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);
	}

	@Test
	public void testSkillNameLength() throws Exception {

		Skills skill = MasterData.getSkills();
		skill.setSkillName("Java");
		Set<ConstraintViolation<Skills>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

	}

	@Test
	public void testRemarkNameLength() throws Exception {
		Skills skill = MasterData.getSkills();
		skill.setSkillValue(5);
		Set<ConstraintViolation<Skills>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

	}

	@Test
	public void testSkillRemark() throws Exception {
		Skills skill = MasterData.getSkills();
		skill.setRemark("Nice");
		Set<ConstraintViolation<Skills>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);
	}

	@Test
	public void testSkillLevel() throws Exception {
		Skills skill = MasterData.getSkills();
		skill.setSkillLevel("Good");
		Set<ConstraintViolation<Skills>> violations = validator.validate(skill);
		yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);
	}

}