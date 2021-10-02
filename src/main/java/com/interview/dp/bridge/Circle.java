package com.interview.dp.bridge;

public class Circle extends Shape{

	public Circle(Color color)
	{
		super(color);
	}
	@Override
	void applyColor() {
		color.applyColor();
	}

}
