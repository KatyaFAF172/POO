package laboratory3;

import java.util.HashMap;
import java.util.Stack;

public class parentheses {
    public boolean checkString( String s){
        //HashMap class implements the map interface by using a hashtable.
        HashMap<Character, Character> map = new HashMap< Character, Character>();
        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');
        Stack<Character> stack = new Stack<Character>();
        char[] charArray = s.toCharArray();//The java string toCharArray() method converts this string into character array.
        // It returns a newly created character array, its length is similar to this
        // string and its contents are initialized with the characters of this string.
        for (Character c: charArray){
            if(map.keySet().contains(c)){  //keySet() returns a set backed by the HashMap itself,
                // and its contains() method calls containsKey().
                stack.push(c);
                //The push(Object item) method is used to Pushes an item onto the top of this stack.
            }
            else
                if(map.values().contains(c)){
                    if( !stack.isEmpty( )&& map.get(stack.peek()) == c){
                        //The peek() method is used to look at the object at the top of this
                        // stack without removing it from the stack.
                        stack.pop();//The pop() method is used to remove the object at the top of this stack
                        // and returns that object as the value of this function.
                    }
                    else
                        return false;
                }
        }
        return stack.isEmpty();
    }
    public static void main ( String[] args){
        String s = "2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15)) ";
        parentheses p = new parentheses();
        boolean flag = p.checkString(s);
        if ( flag == true)
            System.out.println("This is the correct expression");
        else
            System.out.println("This isn't the correct expression");

    }
}
