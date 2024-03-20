package com.japanese.appliaction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japanese.appliaction.model.AddStudentSub;
import com.japanese.appliaction.repository.AddStudentRepo;
import com.japanese.appliaction.service.serviceInterface.AddStudentI;

@Service
public class AddStudentImp implements AddStudentI {
	
	
	@Autowired
	private AddStudentRepo addStudentRepo;

	@Override
	public String save(AddStudentSub addStudentSub) {
		addStudentSub.setStatus("ACTIVE");
		addStudentSub.setEmailId("FROM TOKEN");
		addStudentSub.setPassword("FROM TOKEN");
		addStudentSub.setStudentId("FROM TOKEN");
		addStudentRepo.save(addStudentSub);
		return "Data Save SucessFully !!!";
	}

	@Override
	public AddStudentSub getById(Long sid) {
		Optional<AddStudentSub> add = addStudentRepo.findById(sid);
        if (add.isPresent()){
            return add.get();
        }
        return null;
	}

	@Override
	public List<AddStudentSub> getAllStudents() {
		return addStudentRepo.findAll();
	}

	@Override
	public String deleteById(Long sid) {
		 if (addStudentRepo.existsById(sid)) {
			 addStudentRepo.deleteById(sid);
	            return "Record Deleted Successfully";
	        } else {
	            return "No Record Found";
	        }
	    }

	@Override
	public String update(AddStudentSub addStudentSub) {
	    // Retrieve the existing student object from the database
	    Optional<AddStudentSub> existingStudentOptional = addStudentRepo.findById(addStudentSub.getId());

	    if (existingStudentOptional.isPresent()) {
	        AddStudentSub existingStudent = existingStudentOptional.get();

	        // Update fields only if they are not null in the incoming object
	        if (addStudentSub.getCategory() != null) {
	            existingStudent.setCategory(addStudentSub.getCategory());
	        }
	        if (addStudentSub.getTitle() != null) {
	            existingStudent.setTitle(addStudentSub.getTitle());
	        }
	        if (addStudentSub.getFirstName() != null) {
	            existingStudent.setFirstName(addStudentSub.getFirstName());
	        }
	        if (addStudentSub.getLastName() != null) {
	            existingStudent.setLastName(addStudentSub.getLastName());
	        }
	        if (addStudentSub.getGender() != null) {
	            existingStudent.setGender(addStudentSub.getGender());
	        }
	        if (addStudentSub.getBirthDate() != null) {
	            existingStudent.setBirthDate(addStudentSub.getBirthDate());
	        }
	        if (addStudentSub.getMobileNumberWithCode() != null) {
	            existingStudent.setMobileNumberWithCode(addStudentSub.getMobileNumberWithCode());
	        }
	        if (addStudentSub.getWhatsAppNumberWithCode() != null) {
	            existingStudent.setWhatsAppNumberWithCode(addStudentSub.getWhatsAppNumberWithCode());
	        }
	        if (addStudentSub.getCurrentCountryLocation() != null) {
	            existingStudent.setCurrentCountryLocation(addStudentSub.getCurrentCountryLocation());
	        }
	        if (addStudentSub.getNationality() != null) {
	            existingStudent.setNationality(addStudentSub.getNationality());
	        }
	        if (addStudentSub.getCurrentJapnasesSkill() != null) {
	            existingStudent.setCurrentJapnasesSkill(addStudentSub.getCurrentJapnasesSkill());
	        }
	        if (addStudentSub.getNote() != null) {
	            existingStudent.setNote(addStudentSub.getNote());
	        }
	        if (addStudentSub.getPreferabeCourse() != null) {
	            existingStudent.setPreferabeCourse(addStudentSub.getPreferabeCourse());
	        }
	        if (addStudentSub.getSelectCourse() != null) {
	            existingStudent.setSelectCourse(addStudentSub.getSelectCourse());
	        }
	        if (addStudentSub.getSelectBatch() != null) {
	            existingStudent.setSelectBatch(addStudentSub.getSelectBatch());
	        }
	        if (addStudentSub.getStatus() != null) {
	            existingStudent.setStatus(addStudentSub.getStatus());
	        }

	        // Save the updated student object
	        addStudentRepo.save(existingStudent);

	        return "Data Updated Successfully!";
	    } else {
	        return "Student not found!";
	    }
	}


	
	}


