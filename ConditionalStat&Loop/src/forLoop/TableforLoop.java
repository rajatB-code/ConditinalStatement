package forLoop;

//wap to table of Given Number 

import java.util.Scanner;

public class TableforLoop {
	public static void main(String[] args) {
		int table;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=10 ; i++) {
			table = num * i;
			System.out.println(table );
		}
		sc.close();
		
	}

}
