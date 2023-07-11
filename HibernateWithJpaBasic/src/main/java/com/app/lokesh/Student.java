package com.app.lokesh;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Student {
	@Id
	private Integer studentId;
	private String studentName;
	private Double Fee;
}
