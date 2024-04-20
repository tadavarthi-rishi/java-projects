package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String LastName;
	private String Password;
	private String email;
	private String department;
	private int mailboxcapacity = 500;
	private int defaultpasswordLength = 10;
	private String alternateEmail;
	private String companysuffix = "amazon.com";
	
	//constructor to receive first name and last name
	public Email(String firstName, String LastName) {
		this.firstName = firstName;
		this.LastName = LastName;
		System.out.println("Email createdddd: "+this.firstName+" "+this.LastName);
		
		//call a method asking for the department - return department
		this.department = setDepartment();
		System.out.println("Department : "+this.department);
		
		// call a method that returns random password
		this.Password = randomPassword(defaultpasswordLength);
		System.out.println("Your password is: "+this.Password);
		
		//combine elements to generate email
		email = firstName.toLowerCase()+"."+LastName.toLowerCase()+"@"+department+"."+companysuffix;
		System.out.println("Your email is:   "+email);
	}
	//Ask department
	
	private String setDepartment() {
		System.out.print("Department codes \n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter department code:");
		Scanner in = new Scanner(System.in);
		int deptchoice = in.nextInt();
		
		if(deptchoice == 1) {return "sales";}
		else if (deptchoice == 2) {return "dev";}
		else if (deptchoice == 3) {return "act";}
		else {return "";}
		
	}
	
	//generate a random password
	
	private String randomPassword(int length) {
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
		char[] password = new char[length];
		for(int i =0;i<length;i++) {
			int rand = (int) (Math.random()*passwordset.length());
			password[i] = passwordset.charAt(rand);
		}
		return new String(password);
	}
	//need to set the mailbox capacity
	public void setMailbocCapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassoword(String password) {
		this.Password = password;
	}
	
	public int getMailboxcapacity() {
		return mailboxcapacity;
		
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return Password;
	}
	
}
