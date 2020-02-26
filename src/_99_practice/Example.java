package _99_practice;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		Member user1 = new Member();
		user1.id = "dlalstj0213";
		user1.nickname = "자칭천재";
//		user1.password = "12341234";
		user1.setPassword("123123");
		
		Member[] userDatas = new Member[10];
		
		System.out.println(user1.id);
		System.out.println(user1.nickname);
		System.out.println(user1.getPassword("dlalstj0213"));
		
		Member user2 = new Member();
		user2.id = "asdf";
		user2.nickname="json";
		user2.setPassword("321321");
		
		userDatas[0] = user1;
		userDatas[1] = user2;
		
		boolean result = isUserExist("dlalstj021", userDatas);
		System.out.println(result);
	}
	
	public static boolean isUserExist(String id, Member[] userDatas) {
		for(int i = 0; i <= userDatas.length ; i++) {
			if(userDatas[i].id.equals(id)) {
				return true;
			}
		}
		return false;
	}
}

