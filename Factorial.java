package training;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		int n , f = 1 ;
		System.out.println("Enter the no.") ;
		Scanner sc = new Scanner(System.in) ;
		n = sc.nextInt() ;
		while(n >= 1)
		{
			f = f*n ;
			n-- ;
		}
		
		System.out.println("Factorial :  " + f) ;
	}
}