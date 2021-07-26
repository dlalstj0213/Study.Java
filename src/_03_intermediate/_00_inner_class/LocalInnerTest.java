package _03_intermediate._00_inner_class;

class Outer{

	int outNum = 100;
	static int sNum = 200;

	/*
	 * i 와 num은 컴파일러가 상수로 다시 컴파일하고
	 * 이러한 변수들은 상수 메모리에 적재된다.
	 * 이유? 그 이유는 getRunnable이라는 메소드는 스택메모리에 쌓이고
	 * 메소드 호출이 끝나면 스택메모리에서 제거 되면서 그 안에 있던 모든 변수들도 없어진다.
	 * 하지만 안에 있는 지역 내부 클래스는 다시 사용될 가능성이 있기 때문에 지역 변수를 상수화 시키는 것이다.
	 */
	Runnable getRunnable(int i){ // == final int i

		int num = 100; // == final int num

		class MyRunnable implements Runnable{

			int localNum = 10;

			@Override
			public void run() {
				//num = 200;   //에러 남. 지역변수는 상수로 바뀜
				//i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜
				System.out.println("i =" + i); 
				System.out.println("num = " +num);  
				System.out.println("localNum = " +localNum);

				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {

		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}

