package conditionalLoop;

import java.util.Scanner;

//Wap to check number is positive ,negative or zero

public class NumIsPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number ");
		int num= sc.nextInt();
		
		if(num<0) {
			System.out.println("Number is Negative");
		}
		else if(num>0){
			System.out.println("Number is Positive ");
		}
		else {
			System.out.println("Number is zero");
		}
		sc.close();
	}

}
