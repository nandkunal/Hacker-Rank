package com.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("starting task D");
		set.add("starting task E");
		if(set.contains("starting task D")){
			System.out.println(true);
		}
		
	}

}
