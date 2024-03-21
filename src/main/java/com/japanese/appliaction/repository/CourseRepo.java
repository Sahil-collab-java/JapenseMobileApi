package com.japanese.appliaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.japanese.appliaction.model.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

}
