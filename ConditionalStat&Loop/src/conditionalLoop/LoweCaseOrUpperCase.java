package conditionalLoop;

//Wap to check Given Character is LowerCase or UpperCase

import java.util.Scanner;

public class LoweCaseOrUpperCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Charcter ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(" Character is Lowercase");
		}
		else if(ch >= '0' && ch <= '9'){
			System.out.println("Character is Digits ");
		}
		else {
			System.out.println("Character is uppercase");
		}
		sc.close();
	}

}
