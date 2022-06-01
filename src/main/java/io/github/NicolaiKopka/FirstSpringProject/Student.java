package io.github.NicolaiKopka.FirstSpringProject;

import java.util.List;
import java.util.UUID;

public class Student {
    private final String id = UUID.randomUUID().toString();
    private String firstName;

//    private String lastName;

//    public Student() {
//    }

//    public Student(String firstName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

}
