package com.interview.dp.adapter2;

public class AdapterDemo {

	public static void main(String[] args) {
		Buggati buggati = new Buggati();
		// speed in miles per hr
		System.out.println("Bugati speed in mile per hours :: "+buggati.getSpeed());
		
		// speed in KM per hr
		MovableAdapter adapter = new MovableAdapterImpl(buggati);
		System.out.println("Buggati speed in km per hr :: "+adapter.getSpeed());
	}
}
