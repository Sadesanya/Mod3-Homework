package Homework;
import java.util.Scanner;

public class Homework2 {
	
	public static void main(String[] args) 
	{
		
		// Problem 1: Fibonnaci//
		
		int x, a = 0, b = 0, c = 1;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter values of x: ");
		x = scan.nextInt();
		
		System.out.print("Fibonacci Series: ");
		for (int i = 1; i <= x; i++ );
		{
			
			a = b;
			b = c;
			c = a + b;
			System.out.println(a+" ");
		}
		
		// Problem 2 : Determine whether a user entered number is an Armstrong number
		
				int number = 371, originalNumber, remainder, result = 0;
				
				Scanner s = new Scanner(System.in);
				System.out.println("Enter a number, is it an Armstrong number?");
				number = s.nextInt();

				
		        originalNumber = number;

		        while (originalNumber != 0)
		        {
		            remainder = originalNumber % 10;
		            result += Math.pow(remainder, 3);
		            originalNumber /= 10;
		        }

		        if(result == number)
		            System.out.println(number + " is an Armstrong number.");
		        else
		            System.out.println(number + " is not an Armstrong number.");
		
		     // Question #3 : Write a program to see if a user entered string is a palindrome or not
		    	
				String str, rev ="";
				
				Scanner scann = new Scanner(System.in);
				System.out.println(" Enter a string is it a palindrome?");
				str = scann.nextLine();
				
				
				int length = str.length();
				
				for(int i = length - 1; i >=0; i-- )
					rev = rev + str.charAt(i);
				
				
				if(str.equals(rev))
					System.out.println(str + "is a palindrome!!");
				else
					System.out.println(str + "is not a palindrome!!");
		
		
		
	

	
	
}
	
}