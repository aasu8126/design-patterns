package com.interview.dp.singleton;

public class MySingleton {

//	private static MySingleton obj = null;
	
	private MySingleton() 
	{}
	
	/**
	 * synchronized locking with double check 
	 * */
//	public static MySingleton getInstance()
//	{
//		if(obj == null)
//			synchronized (MySingleton.class) {
//				if(obj == null)
//					obj = new MySingleton();
//			}
//		return obj;
//	}
	
	/**
	 * Bill Pugh Implementation
	 * */
	
	private static class BillPugh{
		private static final MySingleton INSTANCE = new MySingleton();
	}
	
	public static MySingleton getInstance()
	{
		return BillPugh.INSTANCE;
	}
}
