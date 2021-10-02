package com.interview.dp.abstractfactory;

public interface EngineTyreFactoryInterface {

	public Engine buildEngine(String engineType);
	public Tyre buildTyre(String tyreType);
}
