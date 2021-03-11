package com.metanit;

import java.lang.reflect.Array;

public class Student {
    private String name;
    private int studentId;
    private int[] marks;
    private int scholarship = 1000;

    public int getScholarship() {
        return scholarship;
    }

    public Student() {

    }

    public Student(String newName, int newStudentId) {
        name = newName;
        studentId = newStudentId;
    }

    public int getAvgMark () {
        return 0;
    }

    public void changeStudentId() {

    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }
}
