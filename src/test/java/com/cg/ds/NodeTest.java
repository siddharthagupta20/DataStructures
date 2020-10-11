package com.cg.ds;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class NodeTest {
	@Test
	public void givenNumberswhenLinkedShouldReturnLinkedList() { 
		Node<Integer> firstNode=new Node<Integer>(50);
		Node<Integer> secondNode=new Node<Integer>(30);
		Node<Integer> thirdNode=new Node<Integer>(40);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result=firstNode.getNext().equals(secondNode)
				&&secondNode.getNext().equals(thirdNode);
		assertTrue(result);
	}
	
	
}
