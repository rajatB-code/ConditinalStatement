package conditionalLoop;

import java.util.Scanner;

//Wap to check given Character is Alphabet or Digit or any symbol

public class CharacterAlphaOrD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char ch = sc.next().charAt(0);
		
		if((ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z')){
			System.out.println(ch+ "  Is a Alphbet ");
		}
		else if( ch >= '0' && ch<='9') {
			System.out.println(ch+ "   Is a Number");
		}
		else {
			System.out.println(ch+ " Is a Special Symbol");
		}
		
		sc.close();
	}

}
