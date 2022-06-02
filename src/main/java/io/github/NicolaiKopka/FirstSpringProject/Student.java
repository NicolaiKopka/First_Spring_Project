package io.github.NicolaiKopka.FirstSpringProject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private final String id = UUID.randomUUID().toString();
    private String firstName;
    private String lastName;

}
