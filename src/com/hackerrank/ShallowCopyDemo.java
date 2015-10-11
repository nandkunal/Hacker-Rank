package com.hackerrank;

public class ShallowCopyDemo {

	public static void main(String[] args) {
		Vechile v = new Vechile();
		v.setId(1);
		v.setName("Kunal");
		System.out.println(v);
		try {
			Vechile v1 =(Vechile)v.clone();
			System.out.println(v1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
		
		
		
	}
	
}

class Vechile implements Cloneable
{
	
	private String name;
	
	private int Id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}

	@Override
	public String toString() {
		return "Vechile [name=" + name + ", Id=" + Id + "]";
	}
}
