package com.cg.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTest {
	
	@Test
	public void whenNodesAddedShouldReturnLast() {
		LinkedList<Integer> list=new LinkedList<Integer>();
		Node<Integer> firstNode=new Node<Integer>(50);
		Node<Integer> secondNode=new Node<Integer>(30);
		Node<Integer> thirdNode=new Node<Integer>(40);
		list.add(firstNode);
		list.add(secondNode);
		list.add(thirdNode);
		assertEquals(firstNode, list.getTail());
	}

}
