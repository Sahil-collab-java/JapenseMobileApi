package com.japanese.appliaction.model;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String password;
    private String mobileNumber;
    private boolean emailVerified;
    private String role;
    
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDate date;
    private boolean Flag;
    
    
    private String studentId;

    public User() {
        this.studentId = UUID.randomUUID().toString();
    }



}
