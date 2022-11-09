package co.udem.restapiquiz.service;

import co.udem.restapiquiz.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class StudentServiceImpl implements StudentService {
    HashSet<Student> studentList = new HashSet<Student>();

    @Override
    public HashSet<Student> findAllStudent() {
        if (studentList.isEmpty())
            return null;
        else
            return studentList;
    }

    @Override
    public Student findStudentByID(long id) {
        Student student = studentList.stream().filter(s -> s.getId() == id).findAny().orElse(null);
        return student;
    }

    @Override
    public void addStudent(Student s) {
        studentList.add(s);
    }

    @Override
    public void updateStudent(Student s) {
        studentList.add(s);
    }
    @Override
    public void deleteStudent(Student s) {
        studentList.clear();
    }
}
