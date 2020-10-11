package com.cg.ds;

public class Stack<T> {
	
	private LinkedList<T> list;

	public Stack() {
		this.list = new LinkedList<T>();
	}
	public void push(INode<T> node) {
		list.add(node);
	}
	public void pop() {
		list.popFirst();
	}
	public INode<T> peek(){
		return list.getHead();
	}
	public int size() {
		return list.size();
	}
	

}
