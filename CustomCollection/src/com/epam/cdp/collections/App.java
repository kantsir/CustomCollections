package com.epam.cdp.collections;

public class App {

	public static void main(String[] args) {

		IntervalList list = new IntervalList();
		list.add(new Interval(1, 5));
		list.add(new Interval(9, 10));
		list.add(new Interval(2, 4));
		list.add(new Interval(3, 8));
		list.add(new Interval(0, 15));
		list.add(new Interval(0, 17));
		list.add(new Interval(2, 4));
		list.add(new Interval(3, 79));
		list.add(new Interval(500, 1000));
		list.add(new Interval(-2, 500));

		IntervalList list2 = new IntervalList();
		list2.add(new Interval(1, 5));
		list2.add(new Interval(9, 10));
		list2.add(new Interval(2, 4));
		list2.add(new Interval(3, 8));
		list2.add(new Interval(0, 15));
		list2.add(new Interval(0, 17));
		list2.add(new Interval(2, 4));
		list2.add(new Interval(3, 79));
		list2.add(new Interval(500, 1000));
		list2.add(new Interval(-2, 500));
		list2.add(new Interval(-1000, 500));

	    list.addAll(list2);

		for (Interval interval : list) {
			System.out.println(interval);
		}

	}

}
