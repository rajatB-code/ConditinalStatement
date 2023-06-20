package ifelsestatement;

import java.util.Scanner;

//Wap to check given number divisible by 3 & 9

public class DivisibleBy3Or9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		
		if(num % 3== 0 &&  num % 9 == 0 ) {
			System.out.println("Number is Divible by 3 & 9");
		}
		else {
			System.out.println("Number is Not divisible by 3 & 9");
		}
		sc.close();
		
	}

}
