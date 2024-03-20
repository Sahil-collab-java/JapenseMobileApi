package com.japanese.appliaction.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
@Entity
public class AddStudentSub {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String category;
	private String title;
	private String firstName;
	private String lastName;
	private String gender;
	private String birthDate;
	private String mobileNumberWithCode;
	private String whatsAppNumberWithCode;
	private String currentCountryLocation;
	private String nationality;
	private String currentJapnasesSkill;
	private String note;
	private String preferabeCourse;
	private String selectCourse;
	private String selectBatch;
	private String emailId;
	private String password;
	private String studentId;
	
	
	private String status;
	
   @CreationTimestamp
   @Column(updatable = false)
   private LocalDate date;
   private boolean Flag;
	
	
	
	
}
