package _99_practice;
//input과 output의 개념
import java.util.Scanner;

public class _02_JavaCafeF {
	/**View**/
	public static void main(String[] args) {
		Boolean isExit = false;
		Scanner keyboard = new Scanner(System.in);
		int[] americano = new int[] {4500, 20};
		int[] cafeLatte = {5000, 15};
		int[] espresso = {3500, 10};
		int totalAmericano = 0;
		int totalCafeLatte = 0;
		int totalEspresso = 0;

		while (!isExit) {
			print("=====Java Coffee Shop=====");
			print("           메뉴▶");
			print("\t[1]구매하기\n\t[2]관리자 권한\n\t[3]나가기");
			print("입력 : ");
			int choice = keyboard.nextInt();
			line();

			switch(choice) {
			case 1 :

				boolean isback = false;
				while(!isback) {
					print("\t[1]Americano : 4500원\n\t[2]Cafe Latte : 5000원\n\t[3]Espresso : 3500원\n\t[4]돌아가기");
					int select = keyboard.nextInt();
					if(select==1) {
						print("아메리카노 몇잔를 구입하시겠습니까?");
						int totalCost = keyboard.nextInt(); 
						totalCost = total(totalCost);
						print("총 "+totalCost+" 원 입니다");
						totalAmericano+=totalCost;

						break;
					}else if(select==2){
						print("카페라떼 몇잔을 구입하시겠습니까?");

					}
				}


				break;
			case 2 :
				print("카페라떼 몇개를 구입하시겠습니까?");

				break;
			case 3:
				print("end1");
				isExit = true;
				break;

			default :
				break;
			}//switch


			isExit = true;
			print("switchEnd");
		}//while
		print("whileEnd");
		keyboard.close();
	}//main

	/**order**/
	//구매한 총액을 구하는 함수를 만들고 싶음
	public static int total(int num) {  //num 개수 입력		

		int[] americano = new int[] {4500,20};			
		int totalcost = (americano[0] * num);
		return totalcost;
	}
	



	/**Choice**/

	/**Util**/
	public static void line() {
		System.out.println("========================");
	}//line

	public static void print(String str) {
		System.out.println(str);
	}



}//class
