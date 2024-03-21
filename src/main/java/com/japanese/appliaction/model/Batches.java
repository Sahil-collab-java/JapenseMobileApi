package com.japanese.appliaction.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Batches {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String course;
	private String batchName;
	private String batchDemoDate;
	private String batchStartDate;
	private String batchEndDate;
	private String classesDay;
	private String teacher;
	private String zoomDetails;
	
	@CreationTimestamp
    @Column(updatable = false)
    private LocalDate date;
    private boolean Flag;
}
