package _03_intermediate._03_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Grape");
		list.add("Strawberry");
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));
		
		System.out.println();
		
		// 정렬
		list.stream().sorted().forEach(s -> System.out.print(s + "\t"));
		
		System.out.println();
		System.out.println();
		
		// 원소 안에 객체들이 가진 기능을 사용하기 위해서 map을 사용
		list.stream().map(s -> s.length()).forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		System.out.println();
		
		list.stream().filter(s -> s.length() >= 6).forEach(n -> System.out.print(n + "\t"));
		
		System.out.println();
		
		List<String> strList = new ArrayList<>();
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.add("4");
		strList.add("5");
		
		int sum1 = strList.stream().mapToInt(i -> Integer.parseInt(i)).sum();
		System.out.println(sum1);
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		int sum2 = intList.stream().mapToInt(i -> i.intValue()).sum();
		System.out.println(sum2);
	}
}
