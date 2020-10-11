package com.cg.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackTest {
	
	@Test
	public void whenEnteredShouldReturnLast() {
		Stack<Integer> s=new Stack<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		s.push(firstNode);
		s.push(secondNode);
		s.push(thirdNode);
		assertEquals(thirdNode, s.peek());
	}

}
