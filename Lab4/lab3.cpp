#include<iostream>
#include<stack>
#include<string>
#include <fstream>


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
     std::string line_;
     ifstream file_("three_expressions.txt ");

     if(file_.is_open())
     {
         //read file line by line
         while (getline(file_, line_))
            {
            std::cout<<line_<< '\n';
         if(CheckParantheses(line_))
            cout<<"This is the correct expression \n";
         else
            cout<<"This isn't the correct expression \n";
            }
         file_.close();
     }
     else
        std::cout<<"File is not open"<<'\n';
     std::cin.get();
     return 0;
}
