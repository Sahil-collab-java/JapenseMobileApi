package com.japanese.appliaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.japanese.appliaction.model.Batches;


@Repository
public interface BatchesRepo extends JpaRepository<Batches, Long> {

}
