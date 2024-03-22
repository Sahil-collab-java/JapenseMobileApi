package com.japanese.appliaction.service;

import java.util.List;

import com.japanese.appliaction.model.Teacher;

public interface TeacherService {

	Teacher save(Teacher teacher);
	
	Teacher update(Long id,Teacher teacher);
	
	void deleteTeacher(Long id);
	
	List<Teacher> getAllTeacher();

}
