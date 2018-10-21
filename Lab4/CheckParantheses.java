package lab4;

public class CheckParantheses {
    static boolean Parantheses(char character1, char character2)
    {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }




    static boolean areParenthesisBalanced(char expression[])
    {
        Stack st=new Stack();
        for(int i=0;i<expression.length;i++)
        { if (expression[i] == '{' || expression[i] == '(' || expression[i] == '[')
            st.push(expression[i]);
            if (expression[i] == '}' || expression[i] == ')' || expression[i] == ']')
            { if (st.isEmpty())
            { return false; }
            else if ( !Parantheses(st.pop(), expression[i]) )
            { return false; }
            }
        }
        if (st.isEmpty())
            return true;
        else
        { return false; }
    }
}
