package _10_enum;

/**
 * enum은 아래와 같이 멤버를 추가해서 해당 값을 지정해줄 수 있다.
 * 그리고 해당 값은 여러개로 정의가 가능하다. ex) 동(1, "동쪽")
 * 하지만 멤버를 추가할 때의 조건은 해당 값의 privat final 변수를 선언하고 그 값을 설정하는 패턴을 구현해야한다.
 */
public enum Direction {
	동(1), 서(3), 남(5), 북(7);	// 이렇게 괄호 안에 값을 추가할 수 있고 끝에 ;를 붙여준다.
	/*
	 * Tip: 동(1) 을 보면 그저 값을 넣어준것 같이보이지만 enum의 변수 하나하나는 다 객체이기때문에
	 * 사실상 동(1)은 생성자 호출을 하는것과 동일하다.
	 * 즉, 동(1) 은 -> new Direction.동(1) 과 같다.
	 * 그래서 아래의 private 정수 변수와 private 생성자를 정의한 것이다.
	 */
	
	private final int val;	// 정수를 저장할 필드(인스턴스 변수)를 추가
	
	private Direction(int val){ // 생성자 호출,  enum 의 생성자는 항상 private이기 때문에 private 생략해도 된다, 외부에서 생성자 호출 불가능
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
}
