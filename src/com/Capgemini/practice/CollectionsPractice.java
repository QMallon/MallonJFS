package com.Capgemini.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;


class hashTesting{
	int value ;
	String name;
	public hashTesting(int a, String b) {
		this.value = a;
		name = b;
	}
	public int hashCode() {
		return this.name.hashCode();
	}
	public boolean equals(Object b) {
		hashTesting btest = (hashTesting) b;
		if(btest.hashCode() == this.hashCode()) {
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "value: " + value + " Name: " + name;
	}
	
}
public class CollectionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//list, set, map
		String output;
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("one");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");
		hashSet.add("Five");
		System.out.println("HashSet");
		output ="ToString ";
		System.out.println( output + hashSet.toString());
		output = "enchanced forloop";
		for(String num:hashSet) {
			output+= num +" ";
		}
		System.out.println(output);
		
		Iterator<String> hit = hashSet.iterator();
		output = "Iterator ";
		while(hit.hasNext()) {
			output += hit.next() + " ";
		}
		System.out.println(output);
		
		
		
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1,"one");
		hashMap.put(2,"Two");
		hashMap.put(3,"Three");
		hashMap.put(4,"Four");
		hashMap.put(5,"Five");
		System.out.println("\nHashMap");
		
		System.out.println("ToString " + hashMap.toString());
		output = "for loop integer key ";
		for(int x = 1; x<=hashMap.size();x++) {
			output += hashMap.get(x) + " ";
		}
		System.out.println(output);
		Iterator map = hashMap.entrySet().iterator();
		output = "iterator ";
		while(map.hasNext()) {
			output += map.next().toString();
		}
		System.out.println(output);
		
		/*
		ListIterator<Integer, String> mapIT = hashMap.entrySet().iterator();
		output = "List Iterator ";
		while(mapIT.hasNext()) {
			output += mapIT.next().toString();
		}
		System.out.println(output);
		*/
		
		/*System.out.println("Getting values/key seperatly");
		Collection<String> values = hashMap.values();	
		Collection<Integer> keys = hashMap.keySet();
		System.out.println(values.toString());
		System.out.println(keys.toString());
		*/
		
		
		
		
		LinkedList<String> list = new LinkedList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		System.out.println("\nList");
		System.out.println("To String " + list.toString());
		output = "For Loop ";
		for(int x = 0 ; x<list.size();x++) {
			output += list.get(x).toString() + " ";
		}
		System.out.println(output);
	    output = "Enchanced for Loop ";
		for(String num:list) {
			output += num + " ";
		}
		System.out.println(output);
		
		ListIterator<String> lt = list.listIterator(); 
		output = "ListIterator ";
		while(lt.hasNext()){
			output+= lt.next() + " ";
		}
		System.out.println(output);
		
		Iterator<String> iter = list.listIterator(); 
		output = "Iterator ";
		while(iter.hasNext()){
			output+= iter.next() + " ";
		}
		System.out.println(output);
		
		
		
		
		
		
		
		//hashcode and equals
		System.out.println("Hashcode and equals test: Created four objects");
		HashSet<hashTesting> obj = new HashSet<hashTesting>();
		hashTesting t1 = new hashTesting(1,"Quinn");
		hashTesting t2 = new hashTesting(1,"Quinn");
		hashTesting t3 = new hashTesting(1,"QuinnM");
		hashTesting t4 = new hashTesting(2,"Quinn");
		obj.add(t1);
		obj.add(t2);
		obj.add(t3);
		obj.add(t4);
		
		System.out.println(obj.toString());
		
		Vector<String> testv = new Vector();
		testv.add("a");
		testv.add("b");
		testv.add("c");
		testv.add("d");
		
		System.out.println(testv.toString());
		for(String s:testv) {
			System.out.println(s);
		}
		
		
		//table
	}

}
