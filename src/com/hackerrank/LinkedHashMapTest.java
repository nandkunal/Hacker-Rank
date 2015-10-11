package com.hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String,Integer> m = new LinkedHashMap<String,Integer>();
		m.put("apple", 2);
		m.put("banana", 3);
		m.put("oranges", 3);
		System.out.println(m);

	}

}
