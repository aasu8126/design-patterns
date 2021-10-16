package com.interview.dp.adapter2;

public class MovableAdapterImpl implements MovableAdapter{

	Movable movable;
	
	public MovableAdapterImpl(Movable movable) {
		this.movable = movable;
	}
	
	@Override
	public double getSpeed() {
		double speedInMilePerHr = movable.getSpeed();
		return getSpeedInMilesPerHr(speedInMilePerHr);
	}

	private double getSpeedInMilesPerHr(double speedInMilePerHr) {
		return speedInMilePerHr * 1.60934;
	}

}
