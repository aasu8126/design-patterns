package com.interview.dp.builder;

public class CoffeeBuilder {

	public static class Builder
	{
		private String name;
		private int milkQuantity;
		private int sugerQuantity;
		
		public Builder()
		{}
		
		public Builder name(String name)
		{ this.name = name; return this; }
		
		public Builder milkQuantity(int milkQty)
		{ this.milkQuantity = milkQty; return this; }
		
		public Builder sugerQuantity(int sugerQty)
		{ this.sugerQuantity = sugerQty; return this;}
		
		public CoffeeBuilder build()
		{
			return new CoffeeBuilder(this);
		}
	}
	
	private final String name;
	private final int milkQuantity;
	private final int sugerQuantity;
	
	public CoffeeBuilder(Builder builder) {
		this.name = builder.name;
		this.milkQuantity = builder.milkQuantity;
		this.sugerQuantity = builder.sugerQuantity;
	}
	
	public String getName()
	{ return this.name; }
	
	public int getMilkQuantity()
	{ return this.milkQuantity; }
	
	public int getSugerQuantity()
	{ return this.sugerQuantity; }
}
