package com.Capgemini.datastructures;
public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode getHead() {
		return head;
	}

	public INode getTail() {
		return tail;
	}
	
	public void add1(INode node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null)
			this.head = node;
		else {
			INode temp = this.head;
			this.head = node;
			this.head.setNext(temp);
		}
	}

	public void add(INode myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null)
			this.head = myNode;
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}

	public void insertMiddle(INode node, INode newnode) {
		INode temp = node.getNext();
		node.setNext(newnode);
		newnode.setNext(temp);
	}

	public INode popFront() {
		INode temp = this.head;
		this.head = temp.getNext();
		return temp;
	}

	public void printList() {
		StringBuffer myNodes = new StringBuffer("My Nodes : ");
		INode temp = head;
		while (temp.getNext() != null) {
			myNodes.append(temp.getKey());
			if (!temp.equals(tail))
				myNodes.append("->");
			temp = temp.getNext();
		}
		myNodes.append(temp.getKey());
		System.out.println(myNodes);
	}
	
	public void insertBySearch(Integer i, INode newNode) {
		insertMiddle(searchNode(i), newNode);

	}
	
	public INode searchNode(Integer i) {
		INode temp=this.head;
		while(temp.getNext()!=null)
		{
			if(temp.getKey().equals(i))
				break;
			temp=temp.getNext();
		}
		if(!temp.equals(this.tail))
		return temp;
		else
			return null;
	}

	public INode popLast() {
		INode temp = this.head;
		INode temp2 = null;
		while (temp.getNext() != null) {
			if (temp.getNext().equals(this.tail)) {
				temp2 = temp.getNext();
				this.tail = temp;
				temp.setNext(null);
				break;
			}
			temp = temp.getNext();
		}
		return temp2;
	}
	
	public void deleteBySearch(Integer i) {
		INode searchRes = searchNode(i);
		INode temp = this.head;
		if (temp.getNext() == null || searchRes.equals(temp))
			popFront();
		else if (searchRes.equals(tail))
			popLast();
		else {
			while (temp.getNext() != null) {
				if (temp.getNext().equals(searchRes)) {
					temp.setNext(searchRes.getNext());
					break;
				}
				temp = temp.getNext();
			}
		}
	}

	public int size() {
		INode temp = this.head;
		int count = 1;
		if (this.head == null)
			return 0;
		else if (this.head.equals(this.tail))
			return 1;
		else {
			while (temp.getNext() != null) {
				count++;
				temp = temp.getNext();
			}
			return count;
		}
	}
	
	public void addInAscendingOrder(INode node) {
		if (this.head == null || node.getKey().compareTo(this.head.getKey()) < 0)
			add1(node);
		else {
			INode temp = this.head;
			while (temp.getNext() != null) {
				if (( node.getKey()).compareTo(temp.getNext().getKey()) < 0) {
					insertMiddle(temp, node);
					break;
				}
				temp = temp.getNext();
			}
			if (temp.getNext() == null)
				add(node);
		}
	}

}