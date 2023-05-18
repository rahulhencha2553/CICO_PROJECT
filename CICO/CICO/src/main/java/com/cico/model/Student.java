package com.cico.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class Student {

	@Id
	@Column(name = "student_id")
	private Integer studentId;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "full_name")
	private String fullName;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "dob")
	private LocalDate dob;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "college")
	private String college;
	
	@Column(name = "join_date")
	private LocalDate joinDate;
	
	@Column(name = "profile_pic")
	private String profilePic;
	
	@Column(name = "created_date")
	private LocalDateTime createdDate;
	
	@Column(name = "apply_for_course")
	private String applyForCourse;
	
	@Column(name = "current_sem")
	private String currentSem;
	
	@Column(name = "fathers_name")
	private String fathersName;
	
	@Column(name = "mothers_name")
	private String mothersName;
	
	@Column(name = "fathers_occupation")
	private String fathersOccupation;
	
	@Column(name = "contact_father")
	private String contactFather;
	
	@Column(name = "cotact_mother")
	private String cotactMother;
	
	@Column(name = "local_address")
	private String localAddress;
	
	@Column(name = "parmanent_address")
	private String parmanentAddress;
	
	@Column(name = "language_known")
	private String languageKnown;
	
	@Column(name = "current_course")
	private String currentCourse;
	
	@Column(name = "fcm_id")
	private String fcmId;
	
	@Column(name = "device_id")
	private String deviceId;
	
	@Column(name = "in_use_device_id")
	private String inUseDeviceId;
	
	@Column(name = "is_device_approved")
	private String isDeviceApproved;
	
	@Column(name = "device_type")
	private String deviceType;
	
	@Column(name = "is_from_enquiry")
	private Boolean isFromEnquiry;

	@Column(name = "is_converted")
	private Boolean isConverted;
	
	@Column(name = "is_completed")
	private Boolean isCompleted;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@Column(name = "role")
	private String role;
}

