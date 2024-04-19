package training;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, count= 0 ;
		System.out.println("Enter the number.");
		int n = sc.nextInt();
		for(i=2; i<=n; i++)
		{
			count = 0 ;
			for(int j=1; j<=i; j++)
			{
				if(i%j == 0)
				{
					count++ ;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}
