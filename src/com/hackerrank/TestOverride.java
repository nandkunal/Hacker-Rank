package com.hackerrank;

public class TestOverride extends Parent {
	
	public void fun()
	{
		System.out.println("Hi Child");
	}
	
	public static void main(String[] args) {
		Parent p = new TestOverride();
		p.fun();
	}

}

class Parent
{
	public void fun()
	{
		System.out.println("I am parent");
	}
}