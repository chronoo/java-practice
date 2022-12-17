package oop;

import lombok.Data;

import java.util.List;

@Data
public class ComplicatedClass {
    private final int age;
    private final String name;
    private final Gender gender;
    private final List<String> scopes;
    private final List<ComplicatedClass> children;
}

enum Gender {
    MALE,
    FEMALE,
    SHEMALE
}