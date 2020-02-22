package _99_practice;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isEnd = false;
		
		while(!isEnd) {
			System.out.println("입력하세요");
			int num = sc.nextInt();
			if(num ==0) {
				isEnd=true;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}

