package com.interview.dp.factorymethod;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Email notification is sending...");
	}

}
