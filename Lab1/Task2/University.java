package laboratory1task2;

public class University {

    private String univname;
    private Student[] students;

    public University( String univname, Student [] students){
        this.univname = univname;
        this.students = students;
    }

    public Student [] getStudents(){
        return students;
    }



}
