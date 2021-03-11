package com.metanit;

public class Main {

    public static void main(String[] args) {
        //Student student = new Student("Дима", 5);

        Student student = new Student();

        System.out.println(student.getStudentId());

        System.out.println(student.getAvgMark());

        System.out.println(student.getName());

        System.out.println(student.getMarks());
    }

}