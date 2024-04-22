package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		

		
		//Ask how many users want to add
		System.out.println("Enter the number of students to enroll:");
		Scanner in = new Scanner(System.in);
		int numofstudents = in.nextInt();
		Student[] students = new Student[numofstudents];
		
		

		//create n number of new students
		
		
		for(int n=0;n<numofstudents;n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].paytuition();
			System.out.println(students[n].tostring());
			
		}
		
		
		
		

	}

}
