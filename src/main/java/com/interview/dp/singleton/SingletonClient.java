package com.interview.dp.singleton;

public class SingletonClient {
	public static void main(String[] args) {
		MySingleton mySingleton = null;
		for (int i = 0 ; i< 10; i++)
		{
			mySingleton = MySingleton.getInstance();
			System.out.println(mySingleton);
		}
	}
}
