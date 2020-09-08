package _96_codingTest_compress_string;

public class Solution {
	public int solution(String s) {
		int answer = 0;
		
		for(int i=1; i<=(s.length()/2)+1; i++) {
			String test = getSplitedLength(s, i, 1);
			System.out.println("#>> splitedWords : "+test);
			//int result = getSplitedLength(s, i, 1).length();
			int result = test.length();
			//삼항연산자, 삼항 조건문
			answer = (i  == 1) ? result : (answer>result ? result : answer);
			System.out.println("#>> for answer : "+answer);
		}
		
		return answer;
	}
	
	public String getSplitedLength(String s, int n, int repeat) {
		System.out.println("==============="+n+"===============");
		System.out.println("s : "+s);
		System.out.println("n : "+n);
		System.out.println("repeat : "+repeat);
		
		if(s.length() < n) return s;
		String result = "";
		String preString = s.substring(0, n);
		String postString = s.substring(n, s.length());
		//check values
		System.out.println("result : "+result);
		System.out.println("preString : "+preString);
		System.out.println("postString : "+postString);
		
		// 불일치시 -> 현재까지 [반복횟수 + 반복문자] 조합
		if(!postString.startsWith(preString)) {
			System.out.println("check if : false");
			if(repeat == 1) return result += preString  + getSplitedLength(postString, n, 1);
			return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
		}
		System.out.println("check if : true");
		
		return result += getSplitedLength(postString, n, repeat+1);
	}
	
	public static void main(String[] args) {
		Solution solution  = new Solution();
		String test1 = "aabbaccc"; //2a2ba3c : 7
		String test2 = "ababcdcdababcdcd"; //2ababcdcd : 9
		String test3 = "abcabcdede"; //2abcdede : 8
		String test4 = "abcabcabcabcdededededede";  //2abcabc2dedede : 14
		String test5 = "xababcdcdababcdcd"; //xababcdcdababcdcd : 17
		int answer = solution.solution(test3);
		System.out.println("######ANSWER######");
		System.out.println("입출력 값 : "+answer);
		
	}
}
