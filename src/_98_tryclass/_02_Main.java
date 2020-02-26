package _98_tryclass;

import java.util.Scanner;

public class _02_Main {
	public void javaCafe() {
		String[] coffees = {"아메리카노", "카페 라떼", "에스프레소"}; //커피 종류
		int[] prices = {3500, 4000, 2500}; //커피 가격
		int[] stocks = {10, 10, 10}; //커피 재고
		int pw = 1234; // 관리자 비밀번호
		int total = 0; // 총 매출액
		boolean isTerminated = false;
		Scanner keyboard = new Scanner(System.in);
		_07_View view = new _07_View();
		_03_Menu menu = new _03_Menu();
		_04_Admin admin = new _04_Admin();
		_06_Keyboard inputD = new _06_Keyboard();

		while(!isTerminated) {
			view.viewMain();
			int choice = 	inputD.inputData(keyboard);
			
			switch(choice) {
			case 1 : //1. 주문하기
				total += menu.orderSystem(keyboard, coffees, stocks, prices);
				break;
			case 2 : //2. 관리자 페이지
				admin.adminSystem(keyboard, coffees, stocks, pw, total);
				break;
			case 3 : //3. 종료하기
				isTerminated = true;
				break;
			default :
				view.viewWrongInput();
				break;
			}//switch
		}//while : 메인 프로그램 실행 구간
		view.viewWhenTerminate();
		keyboard.close();
	}
}
