package com.vco.connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Array {
	public static int[] add(int[] nums)
	{
		int x = 0;
		int[] res=new int[800];
		for(int i=0;i<nums.length;i++)
		{
			res[i]=nums[i];
           res[nums.length]=x;
		}
		return res;
		
	}
	
	

	public static void main(String[] args)  {
		
		
}
}
        

		
	
	


