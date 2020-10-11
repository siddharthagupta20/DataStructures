package com.cg.ds;

public class Node<T> implements INode<T> {
	private T key;
	private INode<T> next;

	public Node(T key) {
		this.key = key;
	}

	@Override
	public void setKey(T key) {
		// TODO Auto-generated method stub
		this.key=key;
	}

	@Override
	public void setNext(INode<T> next) {
		// TODO Auto-generated method stub
		this.next=next;
	}

	@Override
	public T getKey() {
		// TODO Auto-generated method stub
		return this.key;
	}

	@Override
	public INode<T> getNext() {
		// TODO Auto-generated method stub
		return this.next;
	}
	
	@Override
	public String toString() {
		if(this.next==null)
			return this.key+"";
		return this.key+"->";
	}
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object o) {
		if(o==this)
			return true;
		if(!(o instanceof INode))
			return false;
		INode<T> n=(INode<T>)o;
		return this.getKey()==n.getKey();
	}

}
