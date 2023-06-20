package forLoop;

import java.util.Scanner;

//wap to check the factorial of given number 

public class FactForLoop {
	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			fact = fact * i;
			
		}
		System.out.println("factorial of Number : " +fact);
		sc.close();
	}

}
