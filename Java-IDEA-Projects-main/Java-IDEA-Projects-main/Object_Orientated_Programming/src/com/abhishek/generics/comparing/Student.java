package com.abhishek.generics.comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        // if diff == 0 means both are equal, if diff > 0 means o is smaller, else o is bigger
        return (int)(this.marks - o.marks);
    }
}