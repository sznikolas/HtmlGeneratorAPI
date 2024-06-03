package EqualsAndHashCode;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student(1, "Janos");
        Student student2 = new Student(1, "Janos");

        System.out.println("With Equals(): " + student1.equals(student2));
        System.out.println("With ==: " + (student1 == student2));
        System.out.println("HashCode: " + student1.hashCode());
        System.out.println("HashCode: " + student2.hashCode());
        // primitiv tipusoknak hasznalhatunk nyugodtan ==, viszont objektumoknal mar nem
        // az equals and hash implementalasa nelkul false-t kapunk, mert alapvetoen csak == hasznal ott is. (lasd .equals() metodus leirasa
        // ezert kell overridingolnunk, hogy ne a memoriacimeket hasonlitsa ossze, hanem a tartalmat

        HashSet<Student> set = new HashSet<>();
        Student s3 = new Student(2, "Karoly");
        Student s4 = new Student(2, "Karoly");

        set.add(s3);
        set.add(s4);
        System.out.println("HashSet size with hashCode and equals: " + set.size());
        System.out.println("HashSet size with hashCode and equals: " + set.hashCode());




    }
}
