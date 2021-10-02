package com.interview.dp.proxy;

public class Client {
	public static void main(String[] args) {
		
		Internet itr = new ProxyInternet();
		
		try {
			itr.connectTo("google.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			itr.connectTo("abc.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			itr.connectTo("yahoo.com");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
