package studentDatabaseApp;
import java.util.*;

public class Student {
	private String firstname;
	private String lastname;
	private int gradeyear;
	private int studentID;
	private String courses;
	private int tuitionbalance;
	private int costofcourse = 600;
	
	
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
		
		
	}
	
	
	//generate ID
	
	
	
	//enroll in courses
	
	
	
	//pay tuition
	
	
	
	//show status
	
	

}
