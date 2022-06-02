package io.github.NicolaiKopka.FirstSpringProject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

class StudentServiceTest {

    @Test
    void shouldReturnStudent() {
        Student student = new Student("Anjali", "Sharma");
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        StudentService studentService = new StudentService(studentRepository);
        Mockito.when(studentRepository.findById("1112"))
                .thenReturn(Optional.of(student));

        Optional<Student> actual = studentService.getStudent("1112");
        Assertions.assertThat(actual).contains(student);

    }

    @Test
    void shouldFindNoStudent() {
        Student student = new Student("Anjali", "Sharma");
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        StudentService studentService = new StudentService(studentRepository);
        Mockito.when(studentRepository.findById("1112"))
                .thenReturn(Optional.of(student));

        Optional<Student> actual = studentService.getStudent("unknown");
        Assertions.assertThat(actual).isEmpty();
    }

    @Test
    void shouldReturnUnmodifiableCollectionOfStudents() {
        Student student1 = new Student("Anjali", "Sharma");
        Student student2 = new Student("Rohit", "Kapoor");
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        StudentService studentService = new StudentService(studentRepository);
        Mockito.when(studentRepository.findAll())
                .thenReturn(List.of(student1, student2));

        Collection<Student> actual = studentService.getStudentList();
        Assertions.assertThat(actual)
                .isUnmodifiable()
                .isEqualTo(List.of(student1, student2));
    }

    @Test
    void shouldSaveStudent() {
        Student student1 = new Student("Anjali", "Sharma");
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        StudentService studentService = new StudentService(studentRepository);
        studentService.addStudent(student1);

        Mockito.verify(studentRepository).save(student1);
    }

    @Test
    void shouldDeleteStudent() {
        Student student1 = new Student("Anjali", "Sharma");
        StudentRepository studentRepository = Mockito.mock(StudentRepository.class);
        StudentService studentService = new StudentService(studentRepository);
        studentService.deleteStudent(student1.getId());

        Mockito.verify(studentRepository).deleteStudent(student1.getId());
    }
}