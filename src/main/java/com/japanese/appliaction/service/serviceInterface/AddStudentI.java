package com.japanese.appliaction.service.serviceInterface;

import java.util.List;

import com.japanese.appliaction.model.AddStudentSub;

public interface AddStudentI {
	
	   public  String save(AddStudentSub addStudentSub);
	   
	   public  String update(AddStudentSub addStudentSub);

	    public AddStudentSub getById(Long sid);

	    public List<AddStudentSub> getAllStudents();

	    public String deleteById(Long sid);

}
