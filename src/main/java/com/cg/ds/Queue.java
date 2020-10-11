package com.cg.ds;

public class Queue<T> {
	private LinkedList<T> list;

	public Queue() {
		this.list = null;
	}
	public void enqueue(INode<T> node) {
		list.append(node);
	}
	public int size() {
		return list.size();
	}
}
