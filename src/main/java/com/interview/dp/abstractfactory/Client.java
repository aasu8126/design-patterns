package com.interview.dp.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
		AbstractFactoryCreator abstractFactoryCreator = new AbstractFactoryCreator();
		
		EngineTyreFactoryInterface engineFactory = abstractFactoryCreator.getFactory("engine");
		Engine engine = engineFactory.buildEngine("bmw");
		engine.getEngine();
		
		EngineTyreFactoryInterface tyreFactory = abstractFactoryCreator.getFactory("tyre");
		Tyre tyre = tyreFactory.buildTyre("mrf");
		tyre.getTyre();
		
	}
}
