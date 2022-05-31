package io.github.NicolaiKopka.FirstSpringProject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    StudentService studentService = new StudentService();

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudents(@PathVariable String id) {
        return ResponseEntity.of(studentService.getStudent(id));
    }

    @GetMapping
    public Collection<Student> getAll() {
        return studentService.getStudentList();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }


}
