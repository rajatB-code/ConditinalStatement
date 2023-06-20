package conditionalLoop;

import java.util.Scanner;

public class Less50orNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		if (num<=50) {
			System.out.println("Number is Less than 50 ");
		}
		else {
			System.out.println("Number is not less than 50");
		}
	}

}
