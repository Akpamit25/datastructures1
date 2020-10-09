package com.Capgemini.datastructures;
public interface INode<K extends Comparable>  {
	K getKey();

	void setKey(K key);

	INode getNext();

	void setNext(INode next);

}