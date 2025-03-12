package com.student.studentportal.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.studentportal.Dto.StudentDto;
import com.student.studentportal.Entity.Student;
import com.student.studentportal.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDto createStudent(StudentDto stdnt) {

        System.out.println("Student is created " + stdnt);
        return stdnt;
    }

    public Boolean checkingRespo(String email, String password) {
        System.out.println("checkingRespo " + email + " " + password);
        Optional<Student> student = studentRepository.findByEmail(email);
        // List<Student> student = studentRepository.findByEmail(email);
        if (student.isPresent()) {

            Student stud = student.get();

            if (stud.getPassword().equals(password))
                return true;

        }
        return false;

    }

}
