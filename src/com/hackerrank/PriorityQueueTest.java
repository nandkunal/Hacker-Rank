package com.hackerrank;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
	Queue<Students> q = new PriorityQueue<Students>(new StudentsComparator());
    Students st1 =  new Students();
    st1.setId(1001);
    st1.setName("Test");
    Students st2 =  new Students();
    st2.setId(1002);
    st2.setName("Test1"); 
    q.offer(st1);
    q.offer(st2);
    System.out.println(q);

	}

}

