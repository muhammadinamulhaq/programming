package com.abhishek.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student abhi = new Student(1, 91.3f);
        Student rahul = new Student(12, 81.3f);
        Student arpit = new Student(2, 71.5f);
        Student vaibhav = new Student(14, 95.1f);
        Student rohan = new Student(13, 61.1f);

        Student[] list = {abhi, rahul, arpit, vaibhav, rohan};

        System.out.println(Arrays.toString(list));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int)(o1.marks - o2.marks);
//            }
//        });

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(list));

        if(abhi.compareTo(rahul) > 0){
            System.out.println(abhi.compareTo(rahul));
            System.out.println("rahul has more marks");
        }
    }
}
