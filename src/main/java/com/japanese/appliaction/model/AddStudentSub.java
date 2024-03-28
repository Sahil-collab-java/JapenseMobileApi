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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getMobileNumberWithCode() {
		return mobileNumberWithCode;
	}
	public void setMobileNumberWithCode(String mobileNumberWithCode) {
		this.mobileNumberWithCode = mobileNumberWithCode;
	}
	public String getWhatsAppNumberWithCode() {
		return whatsAppNumberWithCode;
	}
	public void setWhatsAppNumberWithCode(String whatsAppNumberWithCode) {
		this.whatsAppNumberWithCode = whatsAppNumberWithCode;
	}
	public String getCurrentCountryLocation() {
		return currentCountryLocation;
	}
	public void setCurrentCountryLocation(String currentCountryLocation) {
		this.currentCountryLocation = currentCountryLocation;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCurrentJapnasesSkill() {
		return currentJapnasesSkill;
	}
	public void setCurrentJapnasesSkill(String currentJapnasesSkill) {
		this.currentJapnasesSkill = currentJapnasesSkill;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPreferabeCourse() {
		return preferabeCourse;
	}
	public void setPreferabeCourse(String preferabeCourse) {
		this.preferabeCourse = preferabeCourse;
	}
	public String getSelectCourse() {
		return selectCourse;
	}
	public void setSelectCourse(String selectCourse) {
		this.selectCourse = selectCourse;
	}
	public String getSelectBatch() {
		return selectBatch;
	}
	public void setSelectBatch(String selectBatch) {
		this.selectBatch = selectBatch;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean isFlag() {
		return Flag;
	}
	public void setFlag(boolean flag) {
		Flag = flag;
	}
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
