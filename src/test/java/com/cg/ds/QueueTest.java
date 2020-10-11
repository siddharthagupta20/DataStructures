package com.cg.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class QueueTest {
	@Test
	public void whenEnteredShouldReturnLast() {
		Queue<Integer> s = new Queue<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		s.enqueue(firstNode);
		s.enqueue(secondNode);
		s.enqueue(thirdNode);
		assertEquals(3, s.size());
	}
}
