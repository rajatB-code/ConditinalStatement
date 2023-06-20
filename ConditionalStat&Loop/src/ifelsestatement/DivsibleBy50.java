package ifelsestatement;

import java.util.Scanner;

public class DivsibleBy50 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		
		int num = sc.nextInt();
		
		if(num % 5 == 0) {
			System.out.println("Divisible by 5 ");
		}
		else {
			System.out.println("not Divisible by 5");
		}
	}

}
