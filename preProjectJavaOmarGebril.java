

import java.util.Scanner;

public class preProjectJavaOmarGebril {

	public static void main(String[] string) {
		StringBuilder sb1 = new 
                StringBuilder("Hey! You just typed: ");
		System.out.println("Welcome, USER");
		Scanner uInput = new Scanner(System.in);
		System.out.println();
		sb1.append(uInput.nextLine());
		System.out.println(sb1);
	
	}
}
