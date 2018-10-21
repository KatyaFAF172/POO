package laboratory1task2;

public class Student {

    private String name;
    private int age;
    private float avg;

    public Student( String name, int age, float avg){
        this.name = name;
        this.age = age;
        this.avg = avg;
    }

    public float getAvg(){
        return avg;
    }

}
