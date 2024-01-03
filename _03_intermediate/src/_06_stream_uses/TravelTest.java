package _06_stream_uses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TravelTest {
	
	public static void main(String[] args) {
		TravelCustomer customer2 = new TravelCustomer("김유신", 20, 100);
		TravelCustomer customer1 = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customer3 = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> list = new ArrayList<>();
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		
		System.out.println(">>> 고객 명단 출력 :");
		list.stream().map(c -> c.getName()).forEach(System.out::println);
		
		System.out.println(">>> 여행 비용 :");
		System.out.println(list.stream().mapToInt(c -> c.getPrice()).sum());
		
		System.out.println(">>> 20살 이상인 사람의 이름 (with 정렬) : ");
		list.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(System.out::println);
		
		System.out.println(">>> 다양한 정렬");
		System.out.println("<1. getAge로 정순>");
		list.stream().sorted((tc1, tc2) -> {
			if(tc1.getAge() < tc2.getAge()) return -1;
			else if(tc1.getAge() == tc2.getAge()) return 0;
			else return 1;
		}).forEach(System.out::println);
		
		System.out.println("---");
		
		// Comparator 는 Comparable 키를 추출해서 Comparator 객체로 만드는 Function 함수를 인수로 받는 정적 메서드 comparing 을 포함 => comparing 을 사용
		list.stream().sorted(Comparator.comparing((TravelCustomer c) -> c.getAge())).forEach(System.out::println);

		System.out.println("---");
		
		// 메서드 레퍼런스 사용
		list.stream().sorted(Comparator.comparing(TravelCustomer::getAge)).forEach(System.out::println);
		
		
		System.out.println("<2. getAge로 역순>");
		list.stream().sorted((tc1, tc2) -> {
			if(tc1.getAge() > tc2.getAge()) return -1;
			else if(tc1.getAge() == tc2.getAge()) return 0;
			else return 1;
		}).forEach(System.out::println);
		
		System.out.println("---");
		
		list.stream().sorted(Comparator.comparing(TravelCustomer::getAge).reversed()).forEach(System.out::println);
		
		
	}
}
