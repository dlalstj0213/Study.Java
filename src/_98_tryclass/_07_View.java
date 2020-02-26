package _98_tryclass;

public class _07_View {
	public void line() {
		System.out.println("==========================");
	}
	
	public void viewMain() {
		System.out.println("<<<Java Cafe에 오신 것을 환영합니다.>>>");
		System.out.println("1. 주문하기");
		System.out.println("2. 관리자 권한");
		System.out.println("3. 종료하기");
	}
	
	public void viewMenu(int[] prices) {
		line();
		System.out.println("1. 아메리카노 : " + prices[0]);
		System.out.println("2. 카페 라떼 : " + prices[1]);
		System.out.println("3. 에스프레소 : " + prices[2]);
		System.out.println("4. 취소");
	}
	
	public void viewQueryCoffeeNum(String[] coffees, int selectedCoffee) {
		line();
		System.out.println(coffees[selectedCoffee-1]+ "를 선택하셨습니다.");
		System.out.println("몇 잔을 구입하시겠습니까? [0]을 입력하시면 취소됩니다.");
	}

	public void viewAdminPage() {
		line();
		System.out.println("관리자 페이지에 들어오셨습니다.");
		System.out.println("비밀번호를 입력해주세요.");
	}
	
	public void viewCoffeesAndStocksAndTotal(String[] coffees, int[] stocks, int total) {
		line();
		for(int i=0; i<3; i++) {
			System.out.println(coffees[i]+" : "+ stocks[i]+"잔");
		}
		System.out.println("총 매출액 : "+ total);
	}

	public void viewWrongInput() {
		System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
	}
	
	public void viewWhenTerminate() {
		line();
		line();
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("사용해 주셔서 감사합니다.");
		line();
		line();
	}
}
