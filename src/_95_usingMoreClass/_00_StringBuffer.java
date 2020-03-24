package _95_usingMoreClass;

//동기화 되지 않는(unsynchronized) StringBuilder 보다는 동기화(synchronized)가 적용된 StringBuffer을 사용하자
//immutable한 Spring의 단점을 보완하기 위해서 StringBuffer 클래스를 익혀두자

public class _00_StringBuffer {
	public static void main (String []arg) {
		StringBuffer sb = new StringBuffer("자바마스터");
		sb.append("V8");	//문자 추가
		System.out.println(sb);
		System.out.println("=============");
		sb.setLength(0);	//문자 초기화
		sb.append(123456789);
		System.out.println(sb);
		System.out.println("=============");
		sb.reverse();	//문자열 반전
		System.out.println(sb);
		System.out.println("=============");
		sb.replace(2, 5, "ABCDE");	//선택된 문자열 변경
		System.out.println(sb);
		System.out.println("=============");
//		sb.insert()
		
	}
}
