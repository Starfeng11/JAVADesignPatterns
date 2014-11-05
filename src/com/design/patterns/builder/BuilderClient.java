package com.design.patterns.builder;

public class BuilderClient {

    public static void main(String[] args) {

        Student student = new Student.Builder(11, "John", "S").setAge(22).build();
        System.out.println("Student = " + student);
    }

}
