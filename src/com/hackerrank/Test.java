package com.hackerrank;

import java.util.Comparator;
import java.util.TreeSet;

public class Test  {

    public static void main (String[] args) {
         TreeSet<Students> ts = new TreeSet<Students>(new StudentsComparator());
         
     Students st1 =  new Students();
     st1.setId(1001);
     st1.setName("Test");
     Students st2 =  new Students();
     st1.setId(1002);
     st2.setName("Test1"); 
     ts.add(st1);
     ts.add(st2);
     System.out.println(ts);
       
    }
    
}
    
   class Students
   {
	   private int Id;
	   
	   private String name;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [Id=" + Id + ", name=" + name + "]";
	}
	
   }

   
   class StudentsComparator implements Comparator<Students>
   {

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	   
   }
    
    




