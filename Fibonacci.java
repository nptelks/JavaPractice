package training;

import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term for fibonacci series.");
		int term = sc.nextInt() ;
		
		int a=0, b=1, sum=0 ;
		
		System.out.print(a + " " + b);
		
		for(int i=3; i <= term; i++)
		{
			sum = a+b ;
			a = b;
			b = sum;
			
			System.out.print(" " + sum);
		}
	}
}
