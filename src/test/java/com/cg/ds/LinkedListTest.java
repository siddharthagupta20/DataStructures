package com.cg.ds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void whenNodesAddedShouldReturnLast() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		list.add(firstNode);
		list.add(secondNode);
		list.add(thirdNode);
		assertEquals(firstNode, list.getTail());
	}

	@Test
	public void whenNodesAppendedShouldReturnFirst() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		list.append(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		assertEquals(firstNode, list.getHead());
	}

	@Test
	public void whenNodesAddedAtRandomShouldReturnLast() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		list.append(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		Node<Integer> fourthNode = new Node<Integer>(420);
		list.insert(fourthNode, 2);
		assertEquals(thirdNode, list.getTail());
	}

	@Test
	public void whenNodePoppedFirstShouldReturnFirst() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		list.append(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		list.popFirst();
		assertEquals(secondNode, list.getHead());
	}

	@Test
	public void whenNodePoppedLastShouldReturnLast() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		list.append(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		list.popLast();
		assertEquals(secondNode, list.getTail());
	}
	@Test
	public void whenNodeSearchedLastShouldReturnTrue() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		list.append(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		assertTrue(list.search(secondNode));
	}
	@Test
	public void givenElements_whenAskedForLength_shouldReturn3() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Node<Integer> firstNode = new Node<Integer>(50);
		Node<Integer> secondNode = new Node<Integer>(30);
		Node<Integer> thirdNode = new Node<Integer>(40);
		list.append(firstNode);
		list.append(secondNode);
		list.append(thirdNode);
		assertEquals(3,list.size());
	}

}
