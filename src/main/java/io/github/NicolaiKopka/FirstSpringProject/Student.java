package io.github.NicolaiKopka.FirstSpringProject;

import java.util.List;
import java.util.UUID;

public class Student {

    private String name;
    private final String id = UUID.randomUUID().toString();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
