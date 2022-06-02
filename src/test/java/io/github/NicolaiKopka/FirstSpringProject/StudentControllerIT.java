package io.github.NicolaiKopka.FirstSpringProject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentControllerIT {

    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void caseStudentSaveAndGet() {
        Student student = new Student("Anjali", "Sriram");
        ResponseEntity<Void> response = testRestTemplate.postForEntity("/students", student, Void.class);

        Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);

        ResponseEntity<Student[]> result = testRestTemplate.getForEntity("/students", Student[].class);

        Assertions.assertThat(Objects.requireNonNull(result.getBody()).length).isEqualTo(1);
        Assertions.assertThat(result.getBody()[0].getFirstName()).isEqualTo("Anjali");
        Assertions.assertThat(result.getBody()[0].getLastName()).isEqualTo("Sriram");
    }
}