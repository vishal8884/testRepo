package com.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancingTheSymbols {

	public static void main(String[] args) {

		 String expr = "([{}])"; 
		  
	        // Function call 
	        System.out.println(areBracketsBalanced(expr));
	            
	}

	
  
	
	
	public static String areBracketsBalanced(String s)
	{
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			char x = s.charAt(i);
			if(x=='(' || x=='[' || x=='{')
			{
				st.push(x);
			}
			else
			{
				
				if(st.isEmpty())
				{
					return "no8";
				}
				else
				{	
					char pop = st.pop();
				if(s.charAt(i)==')' && pop!='(')
				{
					return "no2";
				}
				else if(s.charAt(i)==']' && pop!='[')
				{
					return "no3";
				}
				else if(s.charAt(i)=='}' && pop!='{')
				{
					return "no4";
				}
				}
			}
		}
		
		if(st.isEmpty())
		{
			return "Yes";
		}
		else
		{
			return "No";
		}
		
		
	}
   
} 






















//static boolean areBracketsBalanced(String expr) 
//{ 
//    // Using ArrayDeque is faster than using Stack class 
//    Deque<Character> stack  = new ArrayDeque<Character>(); 
//
//    // Traversing the Expression 
//    for (int i = 0; i < expr.length(); i++)  
//    { 
//        char x = expr.charAt(i); 
//
//        if (x == '(' || x == '[' || x == '{')  
//        { 
//            // Push the element in the stack 
//            stack.push(x);
//            
//            continue; 
//        } 
//
//        // IF current current character is not opening 
//        // bracket, then it must be closing. So stack 
//        // cannot be empty at this point. 
//        if (stack.isEmpty()) 
//            return false; 
//        char check; 
//        System.out.println(stack+ " :: stack   i::"+i );
//        switch (x) { 
//        case ')': 
//        	check = stack.pop(); 
//        	System.out.println("check :: "+check +"  x:: "+x);
//            if (check == '{' || check == '[') 
//                return false; 
//            break; 
//
//        case '}': 
//            check = stack.pop(); 
//            if (check == '(' || check == '[') 
//                return false; 
//            break; 
//
//        case ']': 
//            check = stack.pop(); 
//            if (check == '(' || check == '{') 
//                return false; 
//            break; 
//        } 
//    } 
//
//    // Check Empty Stack 
//    return (stack.isEmpty()); 
//} 