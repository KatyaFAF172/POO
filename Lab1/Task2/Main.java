package laboratory1task2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Average of all students is " +(Average(Data())));

    }

    private static University[] Data() {
        Student utmStudent1 = new Student("Ion", 21, 8.3f);
        Student utmStudent2 = new Student("David", 22, 9.6f);

        Student[] utmStudents = {utmStudent1, utmStudent2};

        Student ulimStudent1 = new Student("Aya", 25, 10.0f);
        Student ulimStudent2 = new Student("Stela", 24, 7.9f);


        Student[] ulimStudents = {ulimStudent1, ulimStudent2};

        Student asemStudent1 = new Student("GOfer", 23, 9.4f);
        Student asemStudent2 = new Student("Dan", 20, 7.9f);


        Student[] asemStudents = {asemStudent1, asemStudent2};

        University utm = new University("UTM", utmStudents);
        University ulim = new University("ULIM", ulimStudents);
        University asem = new University("ASEM", asemStudents);

        University[] universities = new University[3];
        universities[0] = utm;
        universities[1] = ulim;
        universities[2] = asem;
        return universities;
    }

    private static float Average(University[] universities) {
        float Sum = 0;
        int numberOfStudents = 0;
        for (University university : universities) {
            Student[] students = university.getStudents();
            for (Student student : students) {
                Sum = student.getAvg() + Sum;
            }
            numberOfStudents = university.getStudents().length + numberOfStudents;
        }
        return Sum / numberOfStudents;

    }
}

