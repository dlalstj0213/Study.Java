package _02_functional_interface;

@FunctionalInterface	// 함수형 인터페이스임을 의미, 2개 이상 함수 정의 불가능
public interface MyNumber {
	int getMax(int num1, int num2);
}
