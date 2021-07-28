package _03_intermediate._04_oop_vs_lambda;

public class PrintStringTest {

	public static PrintString returnString() {
		return s -> System.out.println(s + " 람다식");
	}

	public static void showMyString(PrintString ps) {
		ps.showString("매개변수로 전달하는 람다식");
	}

	public static void main(String[] args) {
		String str = "변수에 대입해서 사용한 람다식";

		// 람다식을 변수에 대입
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString(str);

		// 매개변수로 전달하는 람다식
		showMyString(s -> System.out.println(s));
		
		// 반환 값으로 쓰이는 람다식
		PrintString ps = returnString();
		ps.showString("반환 값으로 쓰이는");
	}
}
