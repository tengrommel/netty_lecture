package com.teng.collections.generic;

import java.util.ArrayList;
import java.util.List;

/*
做事要有目的
 */
public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		mc.set("周腾", 35);
		String b = mc.get(35);
		System.out.println(b);
		List list = new ArrayList();
	}
}
