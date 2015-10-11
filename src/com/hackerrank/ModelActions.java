package com.hackerrank;

import java.util.Observable;

public class ModelActions extends Observable {
	private SNode snode;
	
	public SNode getSnode() {
		return snode;
	}

	public void setSnode(SNode snode) {
		this.snode = snode;
		System.out.println(this.snode);
		setChanged();
	    notifyObservers("Object Updated");
	}
	

}
