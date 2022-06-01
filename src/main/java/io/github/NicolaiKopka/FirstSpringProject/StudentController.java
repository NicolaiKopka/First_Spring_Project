package io.github.NicolaiKopka.FirstSpringProject;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {
    StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudents(@PathVariable String id) {
        return ResponseEntity.of(studentService.getStudent(id));
    }

    @GetMapping
    public Collection<Student> getAll() {
        return studentService.getStudentList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }


}
