package com.te.lms.dto;

import java.time.LocalDate;
import java.util.List;

import com.te.lms.enums.EmployeeStatus;
import com.te.lms.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class RegistrationDto {
	
	private String employeeId;
	private String employeeName;
	private LocalDate employeeDOJ;
	private LocalDate employeeDOB;
	
	private String employeeEmail;
	
	private String bloodGroup;
	private String designation;

	private Gender gender;
	private String employeeNationality;
	private EmployeeStatus employeeStatus;

	private SecondaryInfoDto secondaryInfo;
	
	private List<EducationDetailsDto> educationDetails;
	
	private List<AddressDetailsDto> addressDetails;
	
	private BankDetailsDto bankDetails;
	
	private List<TechnicalSkillsDto> technicalSkills;
	
	private List<ExperienceDto> experience;

	private List<ContactDto> contact;
}
