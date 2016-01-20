package com.education.domain;

import javax.persistence.*;

import java.math.BigDecimal;


/**
 * The persistent class for the STUDENT database table.
 * 
 */
@Entity
public class Student {

	@Id @GeneratedValue
	private long studentId;

	private Long age;

	private String emailAdd;

	private String name;

	private BigDecimal phoneNumber;

	public Student() {
	}
	
	public Student(String name) {
	    this.name = name;
        }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigDecimal phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", age=" + age + ", emailAdd=" + emailAdd + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

	
}