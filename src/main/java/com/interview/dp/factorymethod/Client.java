package com.interview.dp.factorymethod;

public class Client {

	public static void main(String[] args) {
		NotificationFactory factory = new NotificationFactory();
		
		Notification notification = null;
		// SMS notification
		System.out.println("================= SMS Notification ====================");
		notification = factory.getNotification("sms");
		notification.notifyUser();
		
		// Email notification
		System.out.println("================= Email Notification ====================");
		notification = factory.getNotification("email");
		notification.notifyUser();
		
		// Push notification
		System.out.println("================= Push Notification ====================");
		notification = factory.getNotification("push");
		notification.notifyUser();
		
		// Notification which is not exists
		System.out.println("================= Not Available Notification ====================");
		notification = factory.getNotification("Twitter");
		notification.notifyUser();
	}
}
