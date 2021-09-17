package com.vco.connections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import java.util.LinkedList;

import java.util.List;

import java.util.Vector;

 

@FunctionalInterface

interface IGreet {  

   public void greeting();   // abstract method

   //public void greeting1();   // abstract method

   public default void writer() {

       System.out.println("the author is Aroha Technologies ");

   }

  

   public static void writer1() {

       System.out.println("static method ...the author is Aroha Technologies ");

   }

}

 

@FunctionalInterface

interface IGreetFriend {  

   public void greet(String name);

}

 

@FunctionalInterface

interface IComputing {

   public float task(float a1,float a2);

}

 

public class LambdaConcepts {

 

    public static void main(String[] args) {

         IGreet g = () -> { System.out.println("good morning "); }; 

          

          g.greeting(); 

          g.writer();

         IGreet.writer1();

        

          IGreet g1 = () -> { System.out.println("Hello friend"); }; 

 

         g1.greeting(); 

 

         IGreetFriend f1 = (x) -> { System.out.println("Hello "+x);

          } ;

 

         f1.greet("Ravi Kumar");

         IGreetFriend f2 =  y -> {

              System.out.println("Hi friend "+y);

          };

 

         f2.greet("Ganesh");

         IComputing ic1 = (x1,y1) ->

          {

              return x1+y1;

          };

        

          float result1 = ic1.task(10,20);

          System.out.println(result1);

 

         IComputing ic2 = (x1,y1) -> ( x1 * y1 );

         float result2 = ic2.task(10.5f,20.24f);

          System.out.println(result2);

         System.out.println("-------------------------");

         // demo of for each with regards to iterating the AL

         //List<String> list=new ArrayList<String>();

         //List<String> list=new LinkedList<String>();

         List<String> list=new Vector<String>();

         list.add("Suresh"); list.add("Vivek"); list.add("Asma Nowsheen");

         list.add("Daniel Patrick"); list.add("Godron Greenidge");

         list.add("James Anderson"); list.add("Anand Sharma");

         list.add("Shobna Natrajan");

         // lambda expression syntax ???

         // (argument-list) -> {body} 

          list.forEach(

                 (x)->

                  {

                      System.out.println(x);

                 }

                 );

 

         Comparator<String> byName = new Comparator<String>() {

                 @Override

                 public int compare(String o1, String o2) {

                     return o1.compareTo(o2);

                 }

             };

             int x = byName.compare("Vinod", "Vinod");

             System.out.println("x is "+x);
             System.out.println("before sorting");
             String names[]  = {"Ravi","Deepak","Ajay","Vijay","Asha"};
             for(String s1:names)
             {
            	 System.out.println(s1);
             }
             System.out.println("------------------");
             System.out.println("after sorting");
             Arrays.sort(names);
             for(String s1:names)
             {
            	 System.out.println(s1);
             }

    }

 

}