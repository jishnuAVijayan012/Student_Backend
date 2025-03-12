package com.student.studentportal.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.studentportal.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public Optional<Student> findByEmail(String email);

}
