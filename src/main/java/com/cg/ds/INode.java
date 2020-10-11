package com.cg.ds;

public interface INode<T>{

	public void setKey(T t);

	public T getKey();

	public void setNext(INode<T> node);

	public INode<T> getNext();

	int compareTo(INode<T> node);


}
