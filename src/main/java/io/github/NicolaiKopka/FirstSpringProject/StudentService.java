package io.github.NicolaiKopka.FirstSpringProject;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    private Map<String, Student> studentList = new HashMap<>();


    public Collection<Student> getStudentList() {
        return Collections.unmodifiableCollection(studentList.values());
    }

    public void addStudent(Student student) {
        studentList.put(student.getId(), student);
    }

    public Optional<Student> getStudent(String id) {
        return Optional.ofNullable(studentList.get(id));
    }
}
