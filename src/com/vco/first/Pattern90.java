package com.vco.first;

public class Pattern90 {
	public static void test(int n)
	{
		int z=90;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(z+" ");
				
			}
			z++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(5);

	}

}
