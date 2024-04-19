package training;

import java.util.Scanner;

public class SumEvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter number to add even and odd.");
		int num = sc.nextInt();
		int even = 0, odd = 0;
		
		for(int i=1; i<=num; i++)
		{
			if(i%2 == 0)
			{
				even = even + i ;
			}
			else
			{
				odd = odd + i ;
			}
		}
		
		System.out.println("Sum of Evens : " + even + "\nSum of Odds : " + odd);
	}
}
