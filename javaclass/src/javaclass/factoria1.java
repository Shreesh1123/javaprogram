package javaclass;

import java.util.Scanner;

public class factoria1 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("enter a number: ");
		int x = scan.nextInt();
		long a=1;
		for (int i=1;i<=x;i++)
		{
			a*=i;
		}
		System.out.println("factorial of number"+x+":" +a);
			
			

	}

}
