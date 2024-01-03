import java.util.Arrays;

public class TestAlgorithm {
	
	
	public int countNum2(int findNo, int startNo, int endNo) {
		int endNoLen = Integer.toString(endNo).length()-1;
		int[][] noArr = new int[endNoLen][endNoLen];
		
		int totNo = 0; // 총 횟수
		
		for(int i=0; i<endNoLen; i++) {
			int[] temp = new int[endNoLen];
			for(int j=0; j<endNoLen; j++) {
				if(i == j) {
					temp[j] = findNo;
					break;
				}
			}
			noArr[i] = temp;
		}
		
		System.out.println(Arrays.deepToString(noArr));
		
		for(int i=0; i<noArr.length; i++) {
			totNo+=1;
			for(int j=0; j<10; j++) {
			}
		}
		
		return totNo;
	}
	
	
	public int countNum1(int findNo, int startNo, int endNo) {
		int totNo = 0; // 총 횟수
		for(int i=startNo; i<=endNo; i++) {
			String temp = String.valueOf(i);
			int chkCnt = 0; // 8 숫자 횟수
			char[] tempArr = temp.toCharArray();
			
			for(int j=0; j<tempArr.length; j++) {
				int chkNo = Integer.parseInt(String.valueOf(tempArr[j]));
				if(chkNo == findNo) chkCnt++;
			}
			
			if(chkCnt > 0) {
				totNo+= chkCnt;
				//System.out.println(i + " > " + chkCnt + "회");
			}
			
		}
		
		return totNo;
	}
	
	
	
	public static void main(String[] args) {
		TestAlgorithm test = new TestAlgorithm();
		
		long start = System.currentTimeMillis();
		int totCnt1 = test.countNum1(8, 1, 100000000);
		long end = System.currentTimeMillis();
		System.out.println( "실행 시작 시간 : "  + start);
		System.out.println( "실행 종료 시간 : " + end);
		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
		System.out.println( "실행 시간 : " + ( end - start));
		System.out.println("총 " + totCnt1 + "회");
		
//		start = System.currentTimeMillis();
//		int totCnt2 = test.countNum2(8, 1, 1000);
//		end = System.currentTimeMillis();
//		System.out.println( "실행 시작 시간 : "  + start);
//		System.out.println( "실행 종료 시간 : " + end);
//		System.out.println( "실행 시간 : " + ( end - start )/1000.0 );
//		System.out.println( "실행 시간 : " + ( end - start));
//		System.out.println("총 " + totCnt2 + "회");
	}
}
