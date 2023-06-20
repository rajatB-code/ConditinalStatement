package ifelsestatement;

import java.util.Scanner;

public class Candidate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("percentage of Candidate :");
		float per = sc.nextFloat();
		System.out.println("Passing Year of Candidate ");
		int year = sc.nextInt();
		
		if(per>= 60 && year >=2021) {
			System.out.println("Candidate Selected in Interview");
		}
		else {
			System.out.println("Candidate Rejected Selected in Interview ");
		}
	}

}
