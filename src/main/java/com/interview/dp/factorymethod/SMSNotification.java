package com.interview.dp.factorymethod;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("SMS Notification is sending...");
	}

}
