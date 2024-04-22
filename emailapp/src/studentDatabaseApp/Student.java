package studentDatabaseApp;
import java.util.*;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses = "";
	private int tuitionbalance;
	private static int costofcourse = 600;
	private static int id = 1001;
	
	
	//constructor prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first Name:");
		this.firstname = in.nextLine();
		
		System.out.println("Enter student Last Name:");
		this.lastname = in.nextLine();
		
		System.out.println("1 - freshmen\n2 - for Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
		this.gradeyear = in.nextInt();
		System.out.println(firstname + " "+ lastname + " " + gradeyear);
		
		
		setStudentId();
		
		
	}
	
	
	//generate ID
	
	private void setStudentId() {
		id++;
		this.studentID = gradeyear+""+id;
		
	}
	
	//enroll in courses
	
	public void enroll() {
		
		do {
		System.out.println("Enter course to enroll (Q to quit):");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if(!course.equals("Q")) {
			courses = courses + "\n " + course;
			tuitionbalance = tuitionbalance + costofcourse;
		}
		else {
			break;
		}} while(1!=0);
		
	}
	
	//view balance
	public void viewbalance() {
		System.out.println("Your balance is: $"+tuitionbalance);
		
	}
	//pay tuition
	public void paytuition() {
		viewbalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionbalance = tuitionbalance - payment;
		System.out.println("Thankyou for the payment of $"+payment);
		viewbalance();
	}
	
	
	
	//show status
	public String tostring() {
		
		return "Name: "+firstname+" "+lastname+
				"\nGrade level: "+gradeyear+
				"\nStudent id: "+studentID+
				"\nCourses enrolled:"+courses+
				"\nBalance: $"+tuitionbalance;
	}
	

}
