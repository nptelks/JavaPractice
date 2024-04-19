package training;

import java.util.Scanner;

public class GcdOrHcf
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter two numbers.");
	    int numOne = sc.nextInt();
	    int numTwo = sc.nextInt();
	    int hcf = 1;
	    int smallest ;
	    if(numOne >= numTwo)
	    	smallest = numTwo ;
	    else
	    	smallest = numOne ;

	    for (int i=1; i<=smallest; i++)
	    {
	    	if (numOne % i == 0 && numTwo % i == 0)
	    	  hcf = i;
	    }

	    System.out.println("hcf is " + hcf);
	}
}
