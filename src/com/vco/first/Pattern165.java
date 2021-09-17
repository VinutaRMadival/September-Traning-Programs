package com.vco.first;

public class Pattern165 {
	public static void test(int n)
	{
	int x=165;
		for(int i=1;i<=n;i++)
		{
	
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print(x+" ");
			x++;
		 }
		
		System.out.println();
		}
	}

	public static void main(String[] args) {
		test(5);
		

	}

}
