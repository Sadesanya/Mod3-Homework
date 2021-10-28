package Homework;

import java.util.Scanner;

public class Homework3 {
	
	public static void main(String[] args) {
		
		   double num1, num2;
		   
	        // Take input from the user
		   
	        @SuppressWarnings("resource")
			Scanner scann = new Scanner(System.in);
	        System.out.println("Enter the numbers");
	        
	        // take the inputs
	        num1 = scann.nextDouble();
	  
	        num2 = scann.nextDouble();
	  
	        System.out.println("Enter the operator (+,-,*,/)");
	  
	        char op = scann.next().charAt(0);
	  
	        double o = 0;
	  
	        switch (op) {
	  
	        // adding
	        case '+':
	  
	            o = num1 + num2;
	  
	            break;
	  
	        // subtract
	        case '-':
	  
	            o = num1 - num2;
	  
	            break;
	  
	        // multiply 
	        case '*':
	  
	            o = num1 * num2;
	  
	            break;
	  
	        // divide 
	        case '/':
	  
	            o = num1 / num2;
	  
	            break;
	  
	        default:
	  
	            System.out.println("You have entered a wrong input");
	  
	            break;
	        }
	  
	        System.out.println("Result: ");
	  
	        System.out.println();
	  
	        // print the final result
	        System.out.println(num1 + " " + op + " " + num2
	                           + " = " + o);
	    }
	

	}


