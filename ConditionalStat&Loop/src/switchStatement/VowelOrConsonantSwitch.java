package switchStatement;

import java.util.Scanner;

//wap to check given character is vowel or Consonant using Switch

public class VowelOrConsonantSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charcter :");
		char ch = sc.next().charAt(0);
		char z = Character.toUpperCase(ch);
		
		switch(z) {
		case 'A' :
			
		case 'E' :
				
		case 'I' :
			
		case 'O' :
			
		case 'U' :
			System.out.println("Vowel");
			break;
		default :
			System.out.println("Consonant");
		}
		sc.close();
	}

}
