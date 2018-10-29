package com.teng.collections.generic;

public class MyCollection<E> {
	Object[] objs = new Object[50];

	public void set(E e, int index) {
		objs[index] = e;
	}

	public E get(int index) {
		return (E)objs[index];
	}
}
