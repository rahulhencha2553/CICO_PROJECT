package com.cico.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cico.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	public Optional<Student> findByUserIdAndIsActiveAndIsCompleted(String userId,boolean active,boolean completed);
}
