 package javaclass;

public class demo2 {
	public static void main(String[] args) {
		int row = 4;
		int count = 1;
		int space = 3;
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=count; k++)
			{
				System.out.print(k);
			}
			System.out.println();
			space--;
			count++;
		}
	}

}
