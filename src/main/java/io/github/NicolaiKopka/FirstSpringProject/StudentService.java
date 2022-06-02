package io.github.NicolaiKopka.FirstSpringProject;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public Collection<Student> getStudentList() {
        return studentRepository.findAll();
    }
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
    public Optional<Student> getStudent(String id) {
        return studentRepository.findById(id);
    }
    public void deleteStudent(String id) {
        studentRepository.deleteStudent(id);
    }

}
