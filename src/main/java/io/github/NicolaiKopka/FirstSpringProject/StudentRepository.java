package io.github.NicolaiKopka.FirstSpringProject;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {
    private final Map<String, Student> studentMap = new HashMap<>();
    public Collection<Student> findAll() {
        return Collections.unmodifiableCollection(studentMap.values());
    }
    public Optional<Student> findById(String id) {
        return Optional.ofNullable(studentMap.get(id));
    }
    public void save(Student student) {
        studentMap.put(student.getId(), student);
    }
    public void deleteStudent(String id) {
        studentMap.remove(id);
    }

}
