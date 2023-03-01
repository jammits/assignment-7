package com.coderscampus.arraylist;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;
	@Override
	public boolean add(T item) {
		if (item == null) {
			return false;
		}

		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}

		items[size] = item;

		size++;

		return true;
//		else {
//
//			if ((this.getSize() - 1) < (items.length - 1)) {
//				items[this.getSize()] = item;
//			}
//			else if ((this.getSize() - 1) == (items.length - 1)) {
//				Object[] moreItems = new Object[items.length * 2];
//
//				Arrays.stream(items)
//						.collect(Collectors.toList())
//						.toArray(moreItems);
//
//				//Make original array reference new array with copy of data
//				items = moreItems;
//				//Add item requested into array
//				items[this.getSize()] = item;
//			}
//			return true;
//		}

	}

	@Override
	public int getSize() {

		return this.size;
//		long numOfElements = Arrays.stream(items)
//				.filter(Objects::nonNull)
//				.count();
//
//		return (int) numOfElements;
	}

	@Override
	public T get(int index) {

		try {
			if (items[index] != null) {
				return (T) items[index];
			}

			else {
				if (index > items.length - 1) {
					throw new ArrayIndexOutOfBoundsException();
				}
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index beyond size of array.");
		}
		return null;
	}
	
}
