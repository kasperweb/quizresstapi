package co.udem.restapiquiz.controller;

import co.udem.restapiquiz.model.Student;
import co.udem.restapiquiz.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class StudentController {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping("/students")
    public HashSet<Student> getAllStudent() {
        return studentServiceImpl.findAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student geStudentById(@PathVariable long id) {
        return studentServiceImpl.findStudentByID(id);
    }

    @PostMapping("/")
    public void addStudent(@RequestBody Student student) {
        studentServiceImpl.addStudent(student);
    }

    @PutMapping("/student/{id}")
    public void updateStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        studentServiceImpl.updateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        studentServiceImpl.deleteStudent(student);
    }
}