package com.design.patterns.builder;

public class Student {

    private int id;
    private int classId;
    private int schoolId;
    private String name;
    private String sex;
    private int age;

    private Student(Builder builder) {
        this.id = builder.id;
        this.classId = builder.classId;
        this.schoolId = builder.schoolId;
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
    }

    public int getId() {
        return id;
    }

    public int getClassId() {
        return classId;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id = " + id).append("//classId = " + classId).append("//SchoolId = " + schoolId)
                .append("//Name = " + name).append("//Sex = " + sex).append("//Age = " + age);
        return stringBuilder.toString();
    }

    static class Builder {
        private int id;
        private int classId;
        private int schoolId;
        private String name;
        private String sex;
        private int age;

        public Builder(int id, String name, String sex) {
            this.id = id;
            this.name = name;
            this.sex = sex;
        }

        public Builder setClassId(int id) {
            this.classId = id;
            return this;
        }

        public Builder setSchoolId(int schoolId) {
            this.schoolId = schoolId;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}
