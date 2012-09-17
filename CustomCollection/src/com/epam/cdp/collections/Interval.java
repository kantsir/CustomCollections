package com.epam.cdp.collections;

public class Interval {

	private int min;
	private int max;

	public Interval() {
	}

	public Interval(int min, int max) {
		this.setMin(min);
		this.setMax(max);
	}	

	public int getMin() {
		min = Math.min(min, max);
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		max = Math.max(min, max);
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "("+getMin()+","+getMax()+")";
	}
}
