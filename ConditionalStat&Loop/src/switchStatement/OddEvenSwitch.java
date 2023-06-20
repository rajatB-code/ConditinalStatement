package switchStatement;

import java.util.Scanner;

//wap to check given number is odd or even using switch case.

public class OddEvenSwitch {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = sc.nextInt();
		
		switch( num % 2) {
		
		case 0 :
			System.out.println("Number is Even");
			break;
		case 1:
			System.out.println("Number is Odd");
			break;
		}
		sc.close();
	}

}
