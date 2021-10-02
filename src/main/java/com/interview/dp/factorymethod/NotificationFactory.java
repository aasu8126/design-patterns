package com.interview.dp.factorymethod;

public class NotificationFactory {

	public Notification getNotification(String notificationType)
	{
		if(notificationType == null || notificationType.isEmpty())
			return null;
		else if(notificationType.equals("sms"))
			return new SMSNotification();
		else if(notificationType.equals("email"))
			return new EmailNotification();
		else if(notificationType.equals("push"))
			return new PushNotification();
		else 
			return new NotAvailableNotification(notificationType);
	}
}
