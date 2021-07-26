package _03_intermediate._01_lambda_expression;

public class AddTest {
	public static void main(String[] args) {

		Add add1 = (x, y) -> {
			return x+y;
		};
		
		Add add2 = (x, y) -> x+y;
		
		
		System.out.println(add1.add(3, 5));
		
		System.out.println(add2.add(2, 5));
	}
}
