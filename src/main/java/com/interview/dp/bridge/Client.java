package com.interview.dp.bridge;

public class Client {

	public static void main(String[] args) {
		Color redColor = new RedColor();
		Shape redSquare = new Square(redColor);
		redSquare.applyColor();
		
		Color blueColor = new BlueColor();
		Shape blueCircle = new Circle(blueColor);
		blueCircle.applyColor();
	}
}
