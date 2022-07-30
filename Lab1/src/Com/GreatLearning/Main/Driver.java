package Com.GreatLearning.Main;

import java.util.Scanner;

import Com.GreatLearning.Services.Credentials;
import Com.GreatLearning.Services.Employee;

public class Driver {
	public static void main(String[] args) {
		Employee obj= new Employee("Hashit", "Choudhary");
		Credentials obj1= new Credentials();
		String generateEmail;
		char[] generatedPassword;
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc= new Scanner(System.in);
		int option= sc.nextInt();
		if (option==1) {
			generateEmail= obj1.generateEmail(obj.getFirstName().toLowerCase(),obj.getLastName().toLowerCase(),"tech");
			generatedPassword= obj1.generatePassword();
			obj1.display(obj,generateEmail,generatedPassword);
		}
		if (option==2) {
			generateEmail= obj1.generateEmail(obj.getFirstName().toLowerCase(),obj.getLastName().toLowerCase(),"admin");
			generatedPassword= obj1.generatePassword();
			obj1.display(obj,generateEmail,generatedPassword);
		}
		if (option==3) {
			generateEmail= obj1.generateEmail(obj.getFirstName().toLowerCase(),obj.getLastName().toLowerCase(),"hr");
			generatedPassword= obj1.generatePassword();
			obj1.display(obj,generateEmail,generatedPassword);
		}if (option==4) {
			generateEmail= obj1.generateEmail(obj.getFirstName().toLowerCase(),obj.getLastName().toLowerCase(),"legal");
			generatedPassword= obj1.generatePassword();
			obj1.display(obj,generateEmail,generatedPassword);
		}
		else 
			System.out.println("Enter a valid option");
			sc.close();
		
	}
}
