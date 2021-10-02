package com.interview.dp.flyweight;

public class FlyweightInventoryDemo {

	public static void main(String[] args) {
		InventorySystem ims = new InventorySystem();
		
		ims.takeOrder("samsung", 123);
		ims.takeOrder("ibm", 432);
		ims.takeOrder("hcl", 392);
		ims.takeOrder("samsung", 545);
		ims.takeOrder("hcl", 777);
		ims.takeOrder("acko", 343);
		ims.takeOrder("samsung", 544);
		ims.takeOrder("hcl", 222);
		ims.takeOrder("acko", 345);
		
		ims.process();
		
		System.out.println(ims.report());
	}
}
