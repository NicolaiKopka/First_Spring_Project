package io.github.NicolaiKopka.FirstSpringProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentController {

    Student student1 = new Student("Raj", "Computer Science", List.of("Anjali", "Mohini"));
    Student student2 = new Student("Mohini", "Computer Science", List.of("Raj", "Anjali"));
    Student student3 = new Student("Anjali", "History", List.of("Raj", "Mohini"));

    @RequestMapping("/")
    @GetMapping
    public List<Student> getStudents() {
        return List.of(student1, student2);
    }

    @RequestMapping("/all")
    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(student1, student2, student3);
    }



//    @GetMapping
//    public List<Student> getMoreStudents() {
//        Student student3 = new Student("Anjali", "History", List.of("Raj", "Mohini"));
//        return List.of(student3);
//    }


    @PostMapping
    public void addStudent() {
        String name = "Rohan";
        student1.addAssociates(name);


    }


}
