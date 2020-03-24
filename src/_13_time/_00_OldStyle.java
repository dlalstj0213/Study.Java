package _13_time;

import java.sql.Date;
import java.util.Calendar;

public class _00_OldStyle {
	//변천사
	//1.0 : Date
	//1.1 : Calendar
	//		-->형식 클래스 : java.text.*
	//1.8 : java.time.*	-->시간 클래스, 형식 클래스 다 있음.
	public static void main(String[] args) {
		//Date JDK 1.0부터
		//Date의 단점을 보완해서 나온게 Calendar JDK 1.1
		//~1.8전까지 쓰임
		//자바가 시간 정보를 다루는 기술이 쓰레기(?)였던 이유
		//기본적으로 위 두 클래스는 Thread-Safe 하지 않는다.	+ immutable 하지 않다--> 무결성X
		//그래도 배우는 이유는 이미 많이 쓰였기 때문에, 코드를 이해하기 위해서
		
		/*****Date JDK 1.0*****/
		java.util.Date uDate = new java.util.Date();
		System.out.println(uDate);
		//시간 비교 : after(Date when), before(Date when), compareTo(Date anotherDate)
		//시간 설정 : from(Instant instant), setTime(long time)
		//시간 정보 얻기 : getTime(), toInstant(), toString()
		
		/*
		 * java.util.Date로부터 상속 받은 클래스이다.
		 * 
		 * 이 클래스는 JDBC를 통해 DBMS에 있는 Date 타입을 맵핑하기 위해서 존재하는 클래스이다
		 * millisecond의 wrapper 클래스이다.
		 * 
		 * 1970.0.0 00:00:00 GMT부터 경과한 시간을 millisecond(1/1000초)로 표현한 것을 Timestamp라고 하고,
		 * DBMS는 Timestamp 를 받아서 날짜를 계산한다.(매우중요)
		 * 
		 * DB로부터 혹은 DB로 시간을 받거나 보낼때 Timestamp 형식으로 보내고 받는데
		 * java.sql.Date라는 클래스 형식으로 받거나 보낸다.
		 * 
		 * 즉, long형인 millisecond가 java.sql.Date라는 클래스 형태로 [기본현->참조형]이 일어나는 것이다.
		 * 그래서 millisecond의 wrapper 클래스 라고 하는 것이다.
		 */
		long nowTime = uDate.getTime();
		java.sql.Date sDate = new java.sql.Date(nowTime);
		System.out.println(sDate);
		//년,월,일만 나타남. 하지만 애초에 시간을 나타내기 위해 있는 클래스가 아니라
		//DB와 맵핑하기 위해서 있는것이기 때문에 크게 상관할 필요가 없다. 어차피 Timestamp(long형)으로 시간을 표현하기 때문.
		
		/*****Calendar JDK 1.1*****/
		//java.util.Date의 단점을 보완하기 위해 나타남.
		//Calendar클래스는 생성자를 직접 호출 못함 protected Calendar
		//게다가 인터페이스 즉, 인스턴스화 못함. Calendar c = new Calendar();	(X)
		//expressed in milliseconds after January 1, 1970, 0:00:00 GMT
		Calendar c  = Calendar.getInstance();
		
	}
}
