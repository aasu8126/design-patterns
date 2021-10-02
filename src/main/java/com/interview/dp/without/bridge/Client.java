package com.interview.dp.without.bridge;

public class Client {
	public static void main(String[] args) {
		Circle circle = new BlueCircle();
		circle.applyColor();
		
		Square square = new BlueSquare();
		square.applyColor();
	}
}
