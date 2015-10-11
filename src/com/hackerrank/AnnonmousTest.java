package com.hackerrank;

public class AnnonmousTest {
	
	public static void main(String[] args) {
		Runnable r= new Runnable() {
			public void run() {
				new AnnonmousTest().myfunc();
			}
		};

		Thread t = new Thread(r);
		t.start();
	}
	
	private void myfunc()
	{
		System.out.println("hello");
	}
	

}

