package com.cg.ds;

public class SortedLinkedList<T extends Comparable<T>> {
	private LinkedList<T> list;

	public SortedLinkedList(LinkedList<T> list) {
		this.list = list;
	}

	public void add(INode<T> node) {
		if (list.getHead() == null)
			list.add(node);
		else {
			if (list.getHead().compareTo(node) > 0) {
				list.add(node);
			} else if (list.getTail().compareTo(node) < 0) {
				list.append(node);
			} else {
				INode<T> current = list.getHead();
				int count = 1;
				while (count++ != list.size() - 1) {
					if (current.compareTo(node) > 0)
						list.insert(node, count - 1);
					current = current.getNext();
				}
			}
		}
	}

	public void search(INode<T> node) {
		list.search(node);
	}

	public int size() {
		return list.size();
	}

	public void pop() {
		list.popLast();
	}

	public INode<T> getTail() {
		return list.getTail();
	}

	public INode<T> getHead() {
		return list.getHead();
	}

	public void print() {
		list.print();
	}
}
