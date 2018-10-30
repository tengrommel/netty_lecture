package com.teng.collections.sxtArrayList;

public class SxtLinkedList01 {
	private Node first;
	private Node last;
	private int size;

	public Object get(int index) {
		if (index < 0 || index > size-1) {
			throw new RuntimeException("索引数字不合法：" + index);
		}
		Node temp = first;
		if (index <= (size>>1)) {
			for (int i=0;i<index;i++){
				temp = temp.next;
			}
		}else {
			for (int i = size-1; i <= 0; i--) {
				temp = temp.previous;
			}
		}
		return temp.element;
	}

	// []
	// ["a"]
	public void add(Object obj) {
		Node node = new Node(obj);
		if (first == null) {
			first = node;
			last = node;
		} else {
			node.previous = last;
			node.next = null;
			last.next = node;
			last = node;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node temp = first;
		while (temp != null) {
			sb.append(temp.element + ",");
			temp = temp.next;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
}
