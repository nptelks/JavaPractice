package training;

import java.util.Scanner;

public class AsciiValue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("Enter a character.");
			char ch = sc.next().charAt(0) ;
			int code = ch ;
			System.out.print(code);
		}
	}
}
