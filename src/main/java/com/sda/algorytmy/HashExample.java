package com.sda.algorytmy;

public class HashExample {
    public static void main(String[] args) {
        Student student1 = new Student( "Jan", "Kow", 1);
        Student student2 = new Student( "Jan", "Kow", 1);

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
