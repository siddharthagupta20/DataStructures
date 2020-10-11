package com.cg.ds;

public class LinkedList<T> {
	private INode<T> head;
	private INode<T> tail;
	private int length;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		length = 0;
	}

	public INode<T> getHead() {
		return head;
	}

	public INode<T> getTail() {
		return tail;
	}

	public void add(INode<T> node) {
		length++;
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {
			this.head.setNext(node);
			this.head = node;
		}

	}

	public void append(INode<T> node) {
		length++;
		if (this.head == null) {
			this.head = node;
			this.tail = node;
		} else {

			this.tail.setNext(node);
			this.tail = node;
		}
	}

	public void insert(INode<T> node, int pos) {
		if (pos > 0 && pos <= length) {
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
			length++;
		} else
			System.out.println("No such position.");

	}

	public void popFirst() {
		this.head = this.head.getNext();
		length--;
	}

	public void popLast() {
		INode<T> currentNode = this.head;
		int count = 0;
		while (!currentNode.equals(null)) {
			count++;
			if (count == (length - 1)) {
				currentNode.setNext(null);
				this.tail = currentNode;
				break;
			}
			currentNode = currentNode.getNext();
		}
		length--;

	}

	public boolean search(INode<T> node) {
		INode<T> currentNode = this.head;
		int count = 0;
		while (!currentNode.equals(null)) {
			count++;
			if (currentNode.equals(node)) {
				System.out.println("Found");
				return true;
			}
			if (count == length) {
				System.out.println("Not Found");
				return false;
			}
			currentNode = currentNode.getNext();

		}
		return false;
	}

}
