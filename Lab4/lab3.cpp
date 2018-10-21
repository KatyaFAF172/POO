#include<iostream>
#include<stack>
#include<string>
using namespace std;
// Function to check whether two characters are opening
// and closing of same type.

bool Parantheses(char opening,char closing)
{
	if(opening == '(' && closing == ')') return true;
	else if(opening == '{' && closing == '}') return true;
	else if(opening == '[' && closing == ']') return true;
	return false;
}
bool CheckParantheses(string exp)
{
	stack<char>  S;
	// Traversing the Expression
	for(int i = 0; i < exp.length(); i++)
	{
		if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
        // Push the element in the stack
			S.push(exp[i]);
		else if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']')
		{
        // IF current current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
			if(S.empty() || !Parantheses(S.top(),exp[i]))
				return false;
			else
				S.pop();
		}
	}
	// Check Empty Stack
	return S.empty() ? true:false;
}

int main()
{
	/*Code to test the function CheckParantheses*/
	string expression;
	cout<<"Enter an expression:  "; // input expression from STDIN/Console
	cin>>expression;//It is used to accept the input from the standard input device i.e. keyboard.
	// Driver program to test above function
	if(CheckParantheses(expression))
		cout<<"This is the correct expression \n";
	else
		cout<<"This isn't the correct expression \n";
}
