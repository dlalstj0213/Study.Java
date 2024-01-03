package _00_inner_class;

class OutClass1{

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass1() {
		inClass = new InClass(); // 내부 클래스 생성
	}

	/**
	 * Instrance Inner Class
	 *  - 내부적으로 사용할 클래스를 선언 (private으로 선언하는 것을 권장)
	 *  - 외부 클래스가 생성된 후 생성됨 ( 정적 내부 클래스와 다름 )
	 *  - private이 아닌 내부 클래스는 다른 외부 클래스에서 생성할 수 있음
	 * @author dlals
	 */
	class InClass{
		int inNum = 100;
		//static int sInNum = 200; // 에러 남, 인스턴스 내부 클래스에서는 정적 변수를 사용할 수 없다.

		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		}

		//static void sTest() {} // 에러 남
	}

	public void usingClass() {
		inClass.inTest(); //  내부 클래스 변수를 사용하여 메서드 호출하기
	}
}

class OutClass2 {

	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	public OutClass2(){
		inClass = new InClass(); // 내부 클래스 생성
	}

	class InClass{

		int inNum = 100;
		//static int sInNum = 200;  //에러 남

		void inTest(){
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		}

		//static void sTest(){  //에러 남

		//}

	}

	public void usingClass(){
		inClass.inTest(); //내부 클래스 변수를 사용하여 메서드 호출하기
	}

	/**
	 * Static Inner Class
	 * - 외부 클래스 생성과 무관하게 사용할 수 있음
	 * - 정적 변수, 정적 메서드 사용
	 * @author dlals
	 */
	static class InStaticClass{

		int inNum = 100;
		static int sInNum = 200;

		void inTest(){   //정적 클래스의 일반 메서드
			//num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)"); 
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}

		static void sTest(){  // 정적 클래스의 static 메서드
			//num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			//inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음

			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");

		}
	}	
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass1 outClass = new OutClass1();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();    // 내부 클래스 기능 호출
		System.out.println();

		OutClass1.InClass inClass = outClass.new InClass();   // 외부 클래스를 이용하여 내부 클래스 생성
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inClass.inTest();	

		System.out.println("--------------------------------------------");

		//외부 클래스 생성하지 않고 바로 정적 내부 클래스 생성
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();  
		System.out.println("정적 내부 클래스 일반 메서드 호출");
		sInClass.inTest();
		System.out.println();

		System.out.println("정적 내부 클래스의 스태틱 메소드 호출");
		OutClass2.InStaticClass.sTest();

	}

}
