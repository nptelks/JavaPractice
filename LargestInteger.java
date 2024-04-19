package training;

import java.util.Scanner;

public class LargestInteger
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter five integers.");
		int[] arr = new int[5] ;
		
		for(int i=0; i<=(arr.length -1); i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int largest = arr[0];
		for(int i=0; i<=(arr.length -1); i++)
		{
			if(arr[i] > largest)
				largest = arr[i];
		}
		
		System.out.println("Largest number : " + largest);
	}
}
