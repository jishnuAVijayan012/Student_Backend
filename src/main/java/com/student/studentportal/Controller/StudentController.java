package com.student.studentportal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentportal.Dto.StudentDto;
import com.student.studentportal.Entity.Student;
import com.student.studentportal.Services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/login")
    public Boolean Authenticate(@RequestBody StudentDto stud) {
        return studentService.checkingRespo(stud.getEmail(), stud.getPassword());

    }

    @GetMapping("/geth")
    public String getMethodName() {
        return "Helo..!!";
    }

}
