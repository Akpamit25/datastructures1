package com.Capgemini.datastructures;

public class MyNode<K> {
	private K key;
	private MyNode<K> next;
	
	public MyNode(K key) {
		this.key= key;
	}

	public MyNode getNext() {
		return next;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}
	
}