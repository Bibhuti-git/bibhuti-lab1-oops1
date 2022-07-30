package Com.GreatLearning.Services;

import java.util.Random;

public class Credentials {
	public char [] generatePassword() {
		String capitals= "ABCDEFGHIJKLMNOPQRST";
		String smalls= "abcdefghijklmnopqrstuvwxyz";
		String chars="!@#$%&*~";
		String numbers="0123456789";
		String combination= capitals+smalls+chars+numbers;
		Random random= new Random();
		char [] passWord= new char[8];
		for(int i=0; i<8; i++) {
			passWord[0]= capitals.charAt(random.nextInt(capitals.length()));
			passWord[1]= smalls.charAt(random.nextInt(smalls.length()));
			passWord[2]= chars.charAt(random.nextInt(chars .length()));
			passWord[3]= numbers.charAt(random.nextInt(numbers.length()));
			passWord[4]= combination.charAt(random.nextInt(combination.length()));
			}
		return passWord;
	}
	public String generateEmail(String firstName,String lastName,String department) {
	return firstName+lastName+'@'+department+".abc.com";
	}
	public void display(Employee emp,String email, char [] generatedPassword){
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email :"+ email);
		System.out.println("Password : 1"+ generatedPassword);
	}
}
