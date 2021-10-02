package com.interview.dp.factorymethod;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Push Notification sending...");
	}

}
