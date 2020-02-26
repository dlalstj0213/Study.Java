package _98_tryclass;

import java.util.Scanner;

public class _04_Admin {

	public boolean checkAdminPw(int inputPw, int pw) {
		if(inputPw == pw) {
			return true; //비밀번호 일치시
		}else {
			return false; //비밀번호 불일치시
		}
	}
	
/////////////////////////////////////////////////////////////////
	public void adminSystem(Scanner keyboard, String[] coffees, int[] stocks, int pw, int total) {
		_07_View view = new _07_View();
		_06_Keyboard inputD = new _06_Keyboard();
		view.viewAdminPage();
		int inputPw = inputD.inputData(keyboard);
		if(checkAdminPw(inputPw, pw)) { //checkAdminPw 성공시
			view.viewCoffeesAndStocksAndTotal(coffees, stocks, total);
		}else {
			view.viewWrongInput(); //checkAdminPw 실패시
		}
	}
}