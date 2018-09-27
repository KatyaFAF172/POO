package lab_1;

import java.util.Scanner;

public class StudentAvg {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();

        s1.get("Ion","ASEM", 22,87, 72, 90);
        s2.get("David","ASEM", 20,76,84,93);

        s3.get("Dan","UTM", 21, 69, 100, 83);
        s4.get("Ofer","UTM",19, 89,88,91);

        s5.get("Aya","ULIM", 23,89,97, 79);
        s6.get("Stela","UTM", 18, 100, 87, 91);

        s1.display();
        s2.display();

        s3.display();
        s4.display();
        s5.display();
        s6.display();
    }
}

