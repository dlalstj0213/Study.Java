package _99_practice;

import java.util.Scanner;

//bit.java 16
public class _00_System{
	public static void main(String[] args) {
		//1. Scanner를 통한 연산
		//2. 점수별 수,우,미,양,가
		//3. 구구단만들기
		
		//1.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); //Enter값이 살아있다. 
		sc.nextLine(); //원래는 뭔가를 입력해야되지만 Enter값이 살아있기 때문에 넘어가진다.
		System.out.print("문자 입력 : ");
		String str = sc.nextLine();
		System.out.print("이름 입력 : ");
		String name = sc.nextLine(); //why nextLine 입력 불가?
		System.out.printf("\n정수 : %d\n문자 : %s\n이름 : %s\n", num, str, name);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 =sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 =sc.nextInt();
		System.out.println("입력1 : ");
		String test = sc.nextLine();
		System.out.println("입력2 : ");
		String test2 = sc.nextLine();
		
		System.out.println("합 : "+(num1+num2));
		System.out.println("뺄셈 : "+(num1-num2));
		System.out.println("곱셈 : "+(num1*num2));
		System.out.println("나눗셈 몫 : "+(num1/num2));
		System.out.println("나눗셈 나머지 : "+(num1%num2));
		 
		sc.close();
		
		
		
		
	}//main
}//class