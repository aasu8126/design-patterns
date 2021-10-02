package com.interview.dp.abstractfactory;

public class AbstractFactoryCreator {

	public EngineTyreFactoryInterface getFactory(String factoryType)
	{
		if(factoryType.equalsIgnoreCase("engine"))
			return new EngineFactory();
		else if(factoryType.equalsIgnoreCase("tyre"))
			return new TyreFactory();
		return null;
	}
}
