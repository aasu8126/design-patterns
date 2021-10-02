package com.inerview.dp.builder;

import com.inerview.dp.builder.CoffeeBuilder.Builder;

public class GetCoffee {

	public static void main(String[] args) {
		
		Builder builder = new CoffeeBuilder.Builder();
		CoffeeBuilder coffeeBuilder = builder.name("Bru").milkQuantity(100).sugerQuantity(2).build();
		System.out.println(coffeeBuilder.getName() + " - "+coffeeBuilder.getMilkQuantity() + " - " + coffeeBuilder.getSugerQuantity());
	}
}
