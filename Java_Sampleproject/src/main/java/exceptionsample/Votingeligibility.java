package exceptionsample;

import java.util.Scanner;

public class Votingeligibility {
	static int age;
	public void eligibility() {
		
		
		if(age<18) {
			System.out.println("The person is not eligible to vote");
			
		}else {
			//System.out.println("The person is eligible to vote");
			throw new ArithmeticException("The person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
		Votingeligibility v = new Votingeligibility();
		v.eligibility();

	}

}
