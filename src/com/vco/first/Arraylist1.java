package com.vco.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("Sanjay Rao");
		l.add("Li");
		l.add("Prathiksha");
		l.add("Vinutha");
		l.add("Sameer");
		//l.add("Issac Vivan Alexander Ricahrds");
		l.add("Anjali");
		l.add("Gagana");
		l.add("Anita Prasad");
		l.add("Anu");
		l.add("Khan Abdul Gaffar Khan");
		Iterator<String> itr = l.iterator();
		while (itr.hasNext())  // does it have next element or not? if there then ITERATE else STOP 
		{
		      String temp = (String) itr.next();
		      
		      if(temp.charAt(0)=='S' || temp.charAt(0)=='G')
		      {
		    	  System.out.println("watch this "+temp);
		      }
		}
		System.out.println("watch brother i am going to iterate again !! ");
		itr = l.iterator(); // when this is done it repositions the pointer to the BEGINING
		int max = 0;
		int min = 173612639;
		String maxName = "";
		String minName = "";
		while (itr.hasNext())  // does it have next element or not? if there then ITERATE else STOP 
		{
		      String temp = (String) itr.next();
		      int how = temp.length();
		      // comparing the name with most chars
		      if (how >= max )
		      {
		    	  max = how;
		    	  maxName = temp;
		      }
		      // comparing the name with least chars
		      if (how <= min ){
		    	  min  = how;
		    	  minName = temp;
		      }
		      /*if(! (temp.charAt(0)=='S' || temp.charAt(0)=='G'))
		      {
		    	  System.out.println("watch this "+temp);
		      }*/
		}
		System.out.println("The name with max char is " + maxName + " how many chars "+max);
		System.out.println("The name with min char is " + minName + " how many chars "+min);
	}


}
