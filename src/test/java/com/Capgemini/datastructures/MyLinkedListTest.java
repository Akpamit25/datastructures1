package com.Capgemini.datastructures;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void given3NumbersWhenAddedToLinkedListShouldBeAddedToRear() {
		MyNode myFirstNode = new MyNode(56);
		MyNode mySecondNode = new MyNode(30);
		MyNode myThirdNode = new MyNode(70);

		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(myFirstNode);
		myLinkedList.add(mySecondNode);
		myLinkedList.add(myThirdNode);
		myLinkedList.printList();
		boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
				&& myLinkedList.tail.equals(myThirdNode);

		assertTrue(result);
	}

	@Test
	public void InsertInMiddleReturnsTrue() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.printList();
		myLinkedList.insertMiddle(MyFirstNode, MySecondNode);
		myLinkedList.printList();
		boolean result = myLinkedList.getHead().equals(MyFirstNode)
				&& myLinkedList.getHead().getNext().equals(MySecondNode)
				&& myLinkedList.getHead().getNext().getNext().equals(MyThirdNode)
				&& myLinkedList.getTail().equals(MyThirdNode);
		assertEquals(true, result);
	}

	@Test
	public void NodeWhenPoppedReturnsNewList() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.printList();
		INode result = myLinkedList.popFront();
		myLinkedList.printList();
		assertEquals(MyFirstNode, result);
	}

	@Test
	public void WhenSearchKeyReturnsNode() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		INode result = myLinkedList.searchNode(30);
		System.out.println(result.getKey());
		assertEquals(MySecondNode, result);
	}
	
	@Test
	public void WhenAddNewNumberBetweenNodesReturnsTrue() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		MyNode<Integer> MyFourthNode = new MyNode<>(40);
		myLinkedList.insertBySearch(30,MyFourthNode);
		myLinkedList.printList();
		boolean result=myLinkedList.searchNode(30).getNext().getKey().equals(40);
		assertEquals(true, result);
	}

	@Test
	public void WhenLastNodePoppedReturnsLastNode() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.printList();
		INode result = myLinkedList.popLast();//
		myLinkedList.printList();
		assertEquals(MyThirdNode, result);
	}
	
	@Test
	public void GivenKeyDeleteThatNodeReturnsNewListSize() {
		MyNode<Integer> MyFirstNode = new MyNode<>(56);
		MyNode<Integer> MySecondNode = new MyNode<>(30);
		MyNode<Integer> MyThirdNode = new MyNode<>(40);
		MyNode<Integer> MyFourthNode = new MyNode<>(70);
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.add(MyFirstNode);
		myLinkedList.add(MySecondNode);
		myLinkedList.add(MyThirdNode);
		myLinkedList.add(MyFourthNode);
		myLinkedList.printList();
		myLinkedList.deleteBySearch(40);
		myLinkedList.printList();
		int i=myLinkedList.size();
		assertEquals(3,i);
	}

}