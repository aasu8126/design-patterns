package com.interview.dp.abstractfactory;

public class EngineFactory implements EngineTyreFactoryInterface {

	@Override
	public Engine buildEngine(String engineType) {
		if(engineType == null || engineType.isEmpty())
			return null;
		else if(engineType.equals("bmw"))
			return new BMW();
		else if (engineType.equals("honda"))
			return new Honda();
		return null;
	}

	@Override
	public Tyre buildTyre(String tyreType) {
		return null;
	}

}
