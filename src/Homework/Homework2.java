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
		
		
		
		
		
	

	
	
}
	
}