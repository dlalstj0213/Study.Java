package _04_oop_vs_lambda;

public class StringConcatImpl implements StringConcat{

	@Override
	public void makeString(String str1, String str2) {
		System.out.println(str1 + "," + str2);
	}
}
