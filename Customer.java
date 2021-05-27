package CarRent;

import java.util.Scanner;
import java.util.UUID;

public class Customer {
	private  String customerId;
	private String name;
	private  long number;
	private String pickUpLocation;
	private String destinationLocation;
	
	
	public static  void setId(String id) {
		 UUID id1 = UUID.randomUUID();
		 System.out.println(id1);
		 
	}
	

	public Register() {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of the customer:");
			String name = sc.nextLine();
			
			System.out.println("Enter mobile number:");
			try{
				long number = sc.nextInt();
			}
			catch(Exception e) {
				
			System.out.println("InvalidRegistrationException");
			}
			
			setId();
			System.out.println("name"+ name + "number"+ number + id );
		
	}
	public void packageSelect() {
		
			System.out.println("Select the package you are prefering:");
			System.out.println("1-dailyrental\n2.Wedding\n3.Tours\n4.Airport");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the pickup location:");
	        pickUpLocation = sc.nextLine();
	        System.out.println("Enter the destination location");
	        destinationLocation = sc.nextLine();
		}
		
		
	}
public computePrice() {
	System.out.println("");
}




