package com.teng.collections.generic;

import java.util.ArrayList;
import java.util.Collection;

/*
测试Collection接口中的方法
 */
public class TestList {
	public static void main(String[] args) {
		Collection c = new ArrayList<>();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		c.add("高老大");
		c.add("高老二");
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.contains("高老大"));
		System.out.println(c.contains("高老五"));

		Object[] objs = c.toArray();
		System.out.println(objs);
		c.remove("高老二");
		System.out.println(c);
		c.clear();
		System.out.println(c.size());
	}
}
