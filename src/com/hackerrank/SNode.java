package com.hackerrank;

public class SNode {
	
	@Override
	public String toString() {
		return "SNode [name=" + name + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
