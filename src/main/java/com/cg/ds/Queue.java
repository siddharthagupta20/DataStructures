package com.cg.ds;

public class Queue<T> {
	private LinkedList<T> list;

	public Queue() {
		this.list = new LinkedList<T>();
	}
	public void enqueue(INode<T> node) {
		list.append(node);
	}
	public int size() {
		return list.size();
	}
	public void dequeue() {
		list.popFirst();
	}
}
