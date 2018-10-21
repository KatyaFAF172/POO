package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static lab4.CheckParantheses.areParenthesisBalanced;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("D:\\Anul II\\Java\\lab4\\three_expression.txt"));
        System.out.println(lines);
        char[] expression =lines.toString().toCharArray();
        if(areParenthesisBalanced(expression))
            System.out.println("This is the correct expression");
        else System.out.println("This isn't the correct expression");
    }
}
