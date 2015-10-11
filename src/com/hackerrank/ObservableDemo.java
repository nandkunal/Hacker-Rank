package com.hackerrank;

import java.util.Observable;
import java.util.Observer;

public class ObservableDemo {

	public static void main(String[] args) {
		SNode snode = new SNode();
		snode.setName("Kunal");
		ModelActions actions = new ModelActions();
		actions.setSnode(snode);
		ObserverFirst first=new ObserverFirst();
		actions.addObserver(first);
		snode.setName("KK");
		actions.setSnode(snode);
		snode.setName("KK1");
		actions.setSnode(snode);
	}
}

class ObserverFirst implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println(arg);
		
	}
	
}

