package conditionalLoop;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the num1");
		int num1 = sc.nextInt();
		System.out.println("Entre the num2");
		int num2 = sc.nextInt();
		System.out.println("+.Addition\t -.Substraction \t *.Multiplication\t /.Division");
		System.out.println("Entre the operator from above menu");
		char op = sc.next().charAt(0);
		switch (op) {
		case '+':
			System.out.println("Addition= " + (num1 + num2));
			break;
		case '-':
			System.out.println("Sunstraction= " + (num1 - num2));
			break;
		case '/':
			System.out.println("Division= " + (num1 / num2));
			break;
		case '*':
			System.out.println("Multiplication= " + (num1 * num2));
			break;
		default:
			System.out.println("Invalid operator");
		}
		sc.close();

	}

}
