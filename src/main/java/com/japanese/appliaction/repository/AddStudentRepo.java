package com.japanese.appliaction.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.japanese.appliaction.model.AddStudentSub;

@Repository
public interface AddStudentRepo extends JpaRepository<AddStudentSub, Long> {

	Optional<AddStudentSub> findById(Integer sid);

	boolean existsById(Integer sid);

	void deleteById(Integer sid);

}
