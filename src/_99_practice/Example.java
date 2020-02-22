package _99_practice;

import java.util.Scanner;

public class Example {

	public static void A(int[] ticketNum) {
		ticketNum[0] +=1;
		return;
	}

	public static void B(int[] tn) {
		tn[1] +=2;
	}


	public static void main(String[] args) {

		//DB
		int[] ticketNum = {10,20,14,55};
		Scanner sc = new Scanner(System.in);
		A(ticketNum);
		B(ticketNum);
	}
}

