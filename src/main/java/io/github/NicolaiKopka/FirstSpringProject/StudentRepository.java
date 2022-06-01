package io.github.NicolaiKopka.FirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.*;

@Repository
public class StudentRepository {
    private Map<String, Student> studentMap = new HashMap<>();
    public Collection<Student> getAllStudents() {
        return Collections.unmodifiableCollection(studentMap.values());
    }
    public Optional<Student> getStudent(String id) {
        return Optional.ofNullable(studentMap.get(id));
    }
    public void addStudent(Student student) {
        studentMap.put(student.getId(), student);
    }

}
