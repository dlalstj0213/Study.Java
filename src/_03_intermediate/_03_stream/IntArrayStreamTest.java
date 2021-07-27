package _03_intermediate._03_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

		public static void main(String[] args) {
			int[] arr = {1, 2, 3, 4, 5};
			
			// 기본 inhanced loop
			for(int num : arr) {
				System.out.println(num);
			}
			
			System.out.println();
			
			// stream 활용
			/*
			 * 스트림은 한번 호출되면 소모되기 때문에 재활용 할 수 없다.
			 * 그렇기 때문에 다시 stream을 사용하기 위해서는 stream을 다시 생성해야한다.
			 */
			Arrays.stream(arr).forEach(n -> System.out.println(n));
			
			IntStream intStream = Arrays.stream(arr);
		}
}
