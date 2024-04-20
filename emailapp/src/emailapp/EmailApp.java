package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Email em1 = new Email("john","smith");
		em1.setAlternateEmail("rs@amazon.com");
		em1.setMailbocCapacity(1000);
		System.out.println(em1.getAlternateEmail());
		System.out.println(em1.getMailboxcapacity());
		

	}

}
