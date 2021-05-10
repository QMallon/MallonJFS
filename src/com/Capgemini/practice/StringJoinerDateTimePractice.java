package com.Capgemini.practice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringJoiner;

public class StringJoinerDateTimePractice {
	interface Printer{
		public void Print(StringJoiner p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s = new StringJoiner(",");
		for(int x = 0; x<10;x++) {
			 s.add("Q");
		}
		Printer p = (x) -> System.out.println(x);
		p.Print(s);
		StringJoiner timeS = new StringJoiner("\n");
		Printer time = (x) -> System.out.println(x);
		
		timeS.add(LocalDate.now().toString());
		timeS.add(LocalTime.now().toString());
		
		time.Print(timeS);
		

	}

}
