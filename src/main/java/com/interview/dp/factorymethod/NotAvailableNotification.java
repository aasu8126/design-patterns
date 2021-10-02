package com.interview.dp.factorymethod;

public class NotAvailableNotification implements Notification {

	private String notificationName;
	
	public NotAvailableNotification(String notificationName)
	{
		this.notificationName = notificationName;
	}
	public String getNotificationName() {
		return notificationName;
	}

	public void setNotificationName(String notificationName) {
		this.notificationName = notificationName;
	}

	@Override
	public void notifyUser() {
		System.out.println(this.getNotificationName() + " notification is not available at this point of time...");
	}

}
