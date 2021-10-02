package com.interview.dp.abstractfactory;

public class TyreFactory implements EngineTyreFactoryInterface {

	@Override
	public Tyre buildTyre(String tyreType) {
		if(tyreType == null || tyreType.isEmpty())
			return null;
		else if(tyreType.equals("mrf"))
			return new MRFTyre();
		else if (tyreType.equals("apollo"))
			return new ApolloTyre();
		return null;
	}

	@Override
	public Engine buildEngine(String engineType) {
		return null;
	}

}
