package _98_tryclass;

import java.util.Scanner;

public class _03_Menu {
	
	
	public int selling(String[] coffees, int selectedCoffee, int[] prices, int[] stocks, int num) {
		int i = selectedCoffee-1; //선택된 커피
		int income = 0; //판매금액
		income = prices[i] * num; // 가격 * 개수
		stocks[i]-= num;
		System.out.println(coffees[i]+"를 "+ income + "원 만큼 파셨습니다.");
		System.out.printf("해당 커피의 현재 남은 재고는 %d잔 있습니다.\n",stocks[i]);
		return income;
	}

	public boolean isDataInRange(int data, int start, int end) {
		if(data >= start && data <=end) {
			return true;
		}else {
			return false;
		}
	}
	
	////////////////////////////////////////////////////////
	public int orderSystem(Scanner keyboard, String[] coffees, int[] stocks, int[] prices) {
		boolean isSelected = false;
		boolean isInputedNum = false;
		int select = 0; //커피선택 변수
		int num = 0; //개수선택 변수
		_07_View view = new _07_View();
		_06_Keyboard inputD = new _06_Keyboard();
		while(true) {
			if(!isSelected) {
				view.viewMenu(prices);
				select = inputD.inputData(keyboard); // 커피선택
				if(isDataInRange(select, 1, 3)) {
					isSelected = true;
				}else if(select==4) {
					break; //while문 강제 파괴
				}else {
					view.viewWrongInput();
					continue;
				}
			}
			if(!isInputedNum) {
				view.viewQueryCoffeeNum(coffees, select);
				num= inputD.inputData(keyboard); //개수 선택
				if(isDataInRange(num, 0, stocks[select-1])){
					isInputedNum = true;
				}else if(num==0){
					break; //while문 강제 파괴
				}else {
					view.viewWrongInput();
					continue;
				}
			}
			return selling(coffees, select, prices, stocks, num);
		}//while
	return 0;
	}

}
