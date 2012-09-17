package com.epam.cdp.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class IntervalList extends AbstractList<Interval> {

	private List<Interval> data = new ArrayList<Interval>();

	private boolean addInterval(Interval inputInterval) {
		
		boolean result = false;
		
		if (data.isEmpty()) {
			return data.add(inputInterval);
		}
				
		ListIterator<Interval> intervalIter = data.listIterator();
		while (intervalIter.hasNext()) {
			Interval currentInterval = intervalIter.next();

			int currentMin = currentInterval.getMin();
			int currentMax = currentInterval.getMax();
			int inputMin = inputInterval.getMin();
			int inputMax = inputInterval.getMax();

			if (Math.max(currentMax, inputMin) > currentMax || Math.min(currentMin, inputMax) < currentMin) {

				if (intervalIter.hasNext()) {
					continue;
				} else {
					intervalIter.add(inputInterval);
					result = true;
				}

			} else {
				int intervalMin = Math.min(currentMin, inputMin);
				int intervalMax = Math.max(currentMax, inputMax);
				
				intervalIter.remove();			
				inputInterval = new Interval(intervalMin, intervalMax);

				if (intervalIter.hasNext()) {
					continue;
				} else {
					intervalIter.add(inputInterval);
					result = true;
				}
			}
		}
		return result;
	}

	@Override
	public boolean add(Interval interval) {
		return addInterval(interval);
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public Interval get(int index) {
		return data.get(index);
	}

}
