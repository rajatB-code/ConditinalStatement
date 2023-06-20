package ifelsestatement;

import java.util.Scanner;

//wap to check given Character z or not

public class CharacterZorNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character ");
		char ch = sc.next().charAt(0);

		if (ch == 'z' || ch == 'Z') {
			System.out.println("Given Character is z ");
		} else {
			System.out.println("given Character is Not z");
		}
		sc.close();
	}

}
