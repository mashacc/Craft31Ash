package JavaFullCourse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("what is your name?");
		String name = scanner.next();
		System.out.println("how old are you?");
		int age = scanner.nextInt();
		System.out.println("Wahat is your favorite food?");
		String food = scanner.nextLine();
		 scanner.next();// scanner.next();// the reason i put this is to clear and go to the next question
		
		
		System.out.println("hello " + name);
		System.out.println("your are "+  age + " years old");
		System.out.println("your favorite food is " + food);
		
		scanner.close();// i always should close my scanner its must
	}

}
