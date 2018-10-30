package com.teng.collections.sxtArrayList;
/*
自定义实现一个ArrayList，体会底层原理
 */
public class SxtArrayList05<E> {
	private Object[] elementData;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;
	public SxtArrayList05() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	public SxtArrayList05(int capacity) {
		if (capacity < 0) {
			throw new RuntimeException("容器的容量不能为负数");
		}else if(capacity == 0) {
			elementData = new Object[DEFAULT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}
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

	public E get(int index){
		checkRange(index);
		return (E)elementData[index];
	}

	public void set(E element, int index) {
		checkRange(index);
		elementData[index] = element;
	}

	public void checkRange(int index) {
		// 索引合法判断[0, size)
		if (index < 0 || index > size-1){
			// 不合法
			throw new RuntimeException("索引不合法：" + index);
		}
	}

	public void remove(E element){
		// element, 将它和所有元素挨个比较，获得第一个比较为true的，返回
		for (int i = 0; i < size; i++) {
			if (element.equals(this.get(i))){ // 容器中所有的比较操作，都是用的equals而不是==
				// 将该元素从此处移除？？？
				remove(i);
			}
		}
	}

	public void remove(int index){
		int numMoved = elementData.length-index-1;
		if (numMoved>0) {
			System.arraycopy(elementData, index + 1, elementData, index, numMoved);
		}
		elementData[--size]=null;
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
