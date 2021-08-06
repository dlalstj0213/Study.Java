package _03_intermediate._10_enum;

enum TestEnum {
	ONE(1, "일"), TWO(2, "이"), THREE(3, "삼"), FOUR(4, "사");

	private static final TestEnum[] TEST_ARR = TestEnum.values();
	private final int i;
	private final String str;

	TestEnum(int i, String str){
		this.i = i;
		this.str = str;
	}
	
	public int getI() {
		return i;
	}

	public String getStr() {
		return str;
	}

	public static TestEnum of(int test) {
		if (test < 1 || test > 4) 
			throw new IllegalArgumentException("invalid value : " + test);
		return TEST_ARR[test -1];
	}
	
	public TestEnum next(int num) {
		num %= 4;
		if(num < 0) num += 4;
		return TEST_ARR[i-1+num];
	}
}

public class AddEnumMemberTest {
	public static void main(String[] args) {
		for(TestEnum te : TestEnum.values()) {
			System.out.printf("%s = %d,%s%n", te.name(), te.getI(), te.getStr());
		}
		
		TestEnum te1 = TestEnum.ONE;
		TestEnum te2 = TestEnum.of(3);
		System.out.println(">>>>>>");
		System.out.printf("%s = %d,%s%n", te1.name(), te1.getI(), te1.getStr());
		System.out.printf("%s = %d,%s%n", te2.name(), te2.getI(), te2.getStr());
		
		System.out.println(">>>>>>");
		System.out.println(TestEnum.ONE.next(1));
		System.out.println(TestEnum.ONE.next(2));
		System.out.println(TestEnum.ONE.next(-1));
		System.out.println(TestEnum.ONE.next(-2));
	}
}
