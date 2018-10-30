package com.teng.collections.sxtArrayList;
/*
自定义实现一个ArrayList，体会底层原理
 */
public class SxtArrayList03<E> {
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	public SxtArrayList03() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	public SxtArrayList03(int capacity) {
		elementData = new Object[capacity];
	}
	public void add(E obj) {
		// 什么时候扩容
		if (size == elementData.length){
			// 怎么扩容
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)]; // 10 --> 10+10/2
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
		elementData[size++] = obj;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//[a,b,c]
		sb.append("[");
		for (int i=0; i<size; i++) {
			sb.append(elementData[i] + ",");
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
}
