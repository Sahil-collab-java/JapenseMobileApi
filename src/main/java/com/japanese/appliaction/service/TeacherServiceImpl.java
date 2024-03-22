package com.japanese.appliaction.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.japanese.appliaction.model.Teacher;
import com.japanese.appliaction.repository.TeacherRepo;

@Service
public class TeacherServiceImpl implements TeacherService {
	
	@Autowired
	TeacherRepo teacherRepo;

	@Override
	public Teacher save(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	@Override
	public Teacher update(Long id, Teacher teacher) {
		Optional<Teacher> optionalTeacher = teacherRepo.findById(id);
		if(!optionalTeacher.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Teacher not found with id: " + id);
		}
		
		Teacher existingTeacher = optionalTeacher.get();
		existingTeacher.setFirstName(teacher.getFirstName());
		existingTeacher.setLastName(teacher.getLastName());
		existingTeacher.setCourses(teacher.getCourses());
		existingTeacher.setBatch(teacher.getBatch());
		existingTeacher.setEmailId(teacher.getEmailId());
		existingTeacher.setPassword(teacher.getPassword());
		existingTeacher.setUniqueId(teacher.getUniqueId());
		existingTeacher.setFlag(teacher.isFlag());
		existingTeacher.setDate(teacher.getDate());
		
		return teacherRepo.save(existingTeacher);
	}

	@Override
	public void deleteTeacher(Long id) {
		teacherRepo.deleteById(id);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		return teacherRepo.findAll();
	}

}
