package com.cg.ds;

public class LinkedList<T> {
	private INode<T> head;
	private INode<T> tail;
	
	public LinkedList() {
		this.head=null;
		this.tail=null;
	}
	public void add(INode<T> node) {
		if(this.head==null) { 
			this.head=node;
			this.tail=node;
		}
		else {
			this.head.setNext(node);
			this.head=node;
		}
			
	}

}
