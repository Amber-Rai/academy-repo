package com.education.domain;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findByName(String name);
}
