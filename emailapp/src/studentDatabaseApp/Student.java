package studentDatabaseApp;
import java.util.*;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private String studentID;
	private String courses = null;
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
		
		System.out.println(firstname+ " " + lastname + " " + gradeyear + " " + studentID);
		
		
		
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
			courses = courses + "\n" + course;
			tuitionbalance = tuitionbalance + costofcourse;
		}
		else {
			break;
		}} while(1!=0);
		
		System.out.println("Enrolled in: "+courses);
		System.out.println("Tuition balance:"+tuitionbalance);
		
	}
	
	//pay tuition
	
	
	
	//show status
	
	

}
