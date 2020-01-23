package javaclass;

public class demo6 {

	public static void main(String[] args) {
		int row = 3;
		for(int i=row;i>=-row;i--)
		{
			for(int j=1;j<=Math.abs(i);j++)
			{
				System.out.print(" ");
			}
			for(int k=row;k>=Math.abs(i);k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
