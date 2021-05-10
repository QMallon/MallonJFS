package com.Capgemini.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class LambdaPractice {

	
	interface Calculator{
		//public int multiply(int a, int b);
		public int stringHash(String s);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scn = new Scanner(System.in);
		//Calculator c1 = (a,b)-> a*b;
		//System.out.println(c1.multiply(10,10));
		Calculator c1 = (s)->s.hashCode();
		Calculator c2 = (s)->10;
	    System.out.println(c1.stringHash("Quinn"));
	    System.out.println(c2.stringHash("Quinn"));
		//int x = scn.nextInt();
	    
	    
	    
	    //Stream
	    Function<Integer, Integer> func = (a)-> (a*2);
	    Predicate<String> pred = s-> s.contains("t");
	    //System.out.println(pred.)
	    LinkedList<Integer> list1 = new LinkedList<>();
	    Collection<Integer> list2 ;
	    Collection<Integer> list3 ;
	    for(int x = 0; x<10;x++) {
	    	list1.add(x);
	    }
	   
	    System.out.println("MAP");
	   list3 = list1.stream().map(i->i+10).collect(Collectors.toList());
	   list3.forEach(x -> System.out.println(x));
	   
	   //System.out.println("flatMAP");
	    //list3 = list1.stream().flatMap(x->Stream.of(x%2)).collect(Collectors.toList());
	    //list3.forEach(x -> System.out.println(x));
	   
	    
	    //List<List<Integer>> list4 = list4.stream().flatMap(x->Stream.of(x)).collect(Collectors.toList(list1, list2, list3));
	    //List<Integer> finalresults = finallist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
	    
	    System.out.println("Filter");
	    list2 =  list1.stream().filter(i->i%2 == 0).collect(Collectors.toList());
	    //list1.forEach(x -> System.out.println(x));
	    list2.forEach(x -> System.out.println(x));
	    //list3.forEach(x -> System.out.println(x));
	    
	    
	    List<Integer> l1 = Arrays.asList(1,2,3,4);
	    List<Integer> l2 = l1.stream().map(i->i+10).collect(Collectors.toList());
	    List<Integer> l3 = Arrays.asList(8,9,10,15);
	    
	    List<List<Integer>> finalList = Arrays.asList(l1,l2,l3);
	    List<Integer> result = finalList.parallelStream().flatMap(i->i.stream().map(n-> n+10)).collect(Collectors.toList());
	    System.out.println(result);
	
	}

}
