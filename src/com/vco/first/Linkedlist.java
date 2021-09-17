package com.vco.first;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
	public static void main(String[] args)
	{
	LinkedList<Integer> l=new LinkedList<Integer>();
	 int sz=0;
	 int high=0;
	 int low=23123239;
	 int n=1;
	 int sum=0;
	 int avg=0;
	 Scanner input=new Scanner(System.in);
	 System.out.println("enter the numbers type 0  to STOP");
	 while(n!=0)
	 {
		 n=input.nextInt();
		 if(n==0)
			 break;
		 if(n>49 && n<151)
		 {
			 l.addFirst(n);
		 }
		 else
			 l.addLast(n);
	 }
	 System.out.println(l);
	 Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			n = itr.next();
			System.out.println("n is " + n);
			if ( n > high)
				high = n;
			if ( n < low )
				low = n;
			sum = sum + n;
		}
		sz = l.size();
		avg = sum / sz;
		System.out.println(" -------------------------------------------------------------- ");
		System.out.println("High is " + high + " Lowest "+low+" sum is "+sum+" avg is "+avg+ " number of ele are "+sz);
		System.out.println(" -------------------------------------------------------------- ");
		
		
	} 

}
