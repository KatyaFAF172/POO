package lab_1;

public class University {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("UTM ");
        System.out.println(" Average score of three students are 98.0, 79.8 and 85.4");
        double[] numArray = { 98.0, 79.8, 85.4};
        double sum = 0.0;

        for (double num: numArray) {
            sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average of the UTM is: %.2f", average);
        System.out.println(); //to start a new line

        System.out.println("-------------------------------------------------");
        System.out.println("ASEM ");
        System.out.println(" Average score of three students are 68.5, 81.8 and 85.4");
        double[] numArray1 = { 68.5, 81.8, 85.4};
        double sum1 = 0.0;

        for (double num1: numArray1) {
            sum1 += num1;
        }

        double average1 = sum1 / numArray1.length;
        System.out.format("The average of the ASEM is: %.2f", average1);
        System.out.println(); //to start a new line

        System.out.println("-------------------------------------------------");
        System.out.println("ULIM ");
        System.out.println(" Average score of three students are 93.5, 88.0 and 75.0");
        double[] numArray2 = { 93.5, 88.0, 75.0};
        double sum2 = 0.0;

        for (double num2: numArray2) {
            sum2 += num2;
        }

        double average2 = sum2 / numArray2.length;
        System.out.format("The average of the ULIM is: %.2f", average2);
    }
}
