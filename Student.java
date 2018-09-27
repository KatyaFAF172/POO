package lab_1;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private String univname;
    private int age;
    private double avg;
    private int sub1,sub2, sub3;


void get (String n, String u, int a, int b1, int b2, int b3){
    this.name = n;
    this.univname = u;
    this.age = a;
    this.sub1 = b1;
    this.sub2 = b2;
    this.sub3 = b3;
}

void display()
{
avg = (sub1 + sub2 + sub3)/3;
    System.out.println("-------------------------------------------------");
    System.out.println("Name of the student: " + name);
    System.out.println("Name of the university: " + univname);
    System.out.println("Age: " + age);
    System.out.println("POO: " + sub1);
    System.out.println("Java: " + sub2);
    System.out.println("Baze de Date: " + sub3);
    System.out.println("Average: " + avg);
}
}
