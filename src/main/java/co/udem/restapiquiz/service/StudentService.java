package co.udem.restapiquiz.service;

import co.udem.restapiquiz.model.Student;

import java.util.HashSet;

public interface StudentService {
    HashSet<Student> findAllStudent();

    Student findStudentByID(long id);

    void addStudent(Student s);

    void updateStudent(Student s);

    //void deleteStudent();

    void deleteStudent(Student s);
}
