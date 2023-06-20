package conditionalLoop;

import java.util.Scanner;

public class Divisibleby5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		
		if(num % 5== 0 &&  num % 11 == 0 ) {
			System.out.println("Number is Divible by 5 & 11");
		}
		else {
			System.out.println("Number is Not divisible by 5 & 11");
		}
		sc.close();
		
	}
	}


