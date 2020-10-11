package com.cg.ds;


public class LinkedList<T> {
	private INode<T> head;
	private INode<T> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<T> getHead() {
		return head;
	}

	public INode<T> getTail() {
		return tail;
	}

	public void add(INode<T> node) {
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			this.head.setNext(node);
			this.head = node;
		}

	}

	public void append(INode<T> node) {
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {

			this.tail.setNext(node);
			this.tail = node;
		}
	}

	public void insert(INode<T> node, int pos) {
		if (pos == 1) {
			node.setNext(this.head);
			this.head = node;
		}
		int count = 0;
		INode<T> currentNode = this.head;
		while (!currentNode.equals(null)) {
			count++;
			if (count == pos - 1) {
				node.setNext(currentNode.getNext());
				currentNode.setNext(node);
				break;
			}
			currentNode = currentNode.getNext();
		}

	}
	public void popFirst() {
		this.head=this.head.getNext();
	}

}
