package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.service.StudentScheduler;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int controller = 0;
		int rollEntry;
		String nameEntry;
		String[] courseEntry;
		StudentScheduler schedule = new StudentScheduler();
		while(controller != 5){
			System.out.println("Please Choose and option");
			System.out.println("1.Add Student\n2.Show Student by roll number\n3.Show students by course name\n4.Show all students\n5.Exit");
			
			controller = scn.nextInt();
			
			
			switch(controller){
			case 1: 
				System.out.println("Please enter a Roll number");
				rollEntry = scn.nextInt();
				System.out.println("Please enter name");
				nameEntry = scn.next();
				//scn.NextLine();
				System.out.println("Please enter number of courses");
				int placeholder = scn.nextInt();
				courseEntry = new String[placeholder];
				for(int x = 0 ;x<placeholder;x++) {
					System.out.println("Please enter a course");
					courseEntry[x] = scn.next();
				}
				
				
				System.out.println(schedule.addStudent(rollEntry, nameEntry, courseEntry));
				
			
				
				break;
			case 2:
				System.out.println("Please enter roll number");
				rollEntry = scn.nextInt();
				System.out.println(schedule.getStudent(rollEntry));
				break;
			case 3:
				System.out.println("Please enter a course name");
				schedule.getStudentbyClass(scn.next());
				break;
			case 4:
				//show all
				schedule.getAllStudents();
				break;
			case 5:
				System.exit(0);
			

			default: 
				System.out.println("Please enter a valid number");
				break;
			}
			
			

	}

}
}
