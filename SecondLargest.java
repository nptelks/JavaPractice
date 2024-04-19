package training;

import java.util.Scanner;

public class SecondLargest
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
		
		for(int i=0; i<=(arr.length -1); i++)
		{
			for(int j=i+1; j<=(arr.length -1); j++) 
            {
                if(arr[i] < arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
		}
		
		System.out.println("Second Largest number : " + arr[1]);
	}
}
