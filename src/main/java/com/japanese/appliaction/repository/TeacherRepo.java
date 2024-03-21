package com.japanese.appliaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.japanese.appliaction.model.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {

}
