package Homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  score;    // To hold a test score
	      char grade;    // To hold a letter grade.

	      // Create a Scanner object to read input.
	      Scanner console = new Scanner(System.in);

	      // Get the test score.
	      System.out.print("Enter your numeric test score : ");
	      score = console.nextInt();

	      // Calculate the grade.
	      if (score >= 90)
	      {
	         grade = 'A';
	      }
	      else if (score >= 80)
	      {
	         grade = 'B';
	      }
	      else if (score >= 70)
	      {
	         grade = 'C';
	      }
	      else if (score >= 50)
	      {
	         grade = 'D';
	      }
	      else
	      {
	         grade = 'F';
	      }

	      // Display the grade.
	      System.out.println("Your grade is " + grade);
	
	      
	      // Second Question
	      
			Scanner scan = new Scanner (System.in);
			

			System.out.print("Enter number between 1 and 7: ");
			
			int num = scan.nextInt();
			
			switch(num){
				case 1: 
					System.out.println("Monday");
					break;
				case 2: 
					System.out.println("Tuesday");
					break;
				case 3: 
					System.out.println("Wednesday");
					break;
				case 4: 
					System.out.println("Thursday");
					break;
				case 5: 
					System.out.println("Friday");
					break;
				case 6: 
					System.out.println("Saturday");
					break;
				case 7: 
					System.out.println("Sunday");
					break;
				default: 
					System.out.println("Invalid Input");
			}
					
					//Third Question
					
					Scanner choose = new Scanner (System.in);
					
//					System.out.println();
					System.out.println("Enter a number for your coolness: ");
					int numm = choose.nextInt();
					if (numm % 2 == 0)
					{
						if (numm > 1 && numm < 6)
						{
							System.out.println("Not Cool");
						}
						else if (numm > 5 && numm < 21)
						{
							System.out.println("Cool");
						}
						else 
						{
							System.out.println("Not Cool");
						}
					}	
					else
					{
						System.out.println("Cool");
					}
	}
	}


	