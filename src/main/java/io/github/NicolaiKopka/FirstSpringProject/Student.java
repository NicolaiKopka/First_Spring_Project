package io.github.NicolaiKopka.FirstSpringProject;

import java.util.List;
import java.util.UUID;

public class Student {

    private String name;
    private String id;
    private String subject;
    public List<String> associates;

    public Student(String name, String subject, List<String> associates) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.subject = subject;
        this.associates = associates;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getAssociates() {
        return associates;
    }

    public void addAssociates(String name) {
        this.associates.add(name);
    }
}
