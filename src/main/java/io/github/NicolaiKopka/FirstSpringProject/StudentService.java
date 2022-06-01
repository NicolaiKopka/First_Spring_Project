package io.github.NicolaiKopka.FirstSpringProject;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Collection<Student> getStudentList() {
        return studentRepository.getAllStudents();
    }
    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }
    public Optional<Student> getStudent(String id) {
        return studentRepository.getStudent(id);
    }

}
