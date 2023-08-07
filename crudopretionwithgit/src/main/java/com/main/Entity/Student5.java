package com.main.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student5 {

	@Id
	private int sid;
	private String sname;
	private String saddr;
	private long smob;
	private int age;
}
