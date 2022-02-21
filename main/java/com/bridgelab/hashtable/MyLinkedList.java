package com.bridgelab.hashtable;

public class MyLinkedList<K> {
	
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	public INode<K> search(K node) {
		INode<K> tempNode = head;
		while( tempNode != null && tempNode.getNext() != null ) {
			if(tempNode.getKey().equals(node)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}

	public void append(INode<K> myNode) {
		if(this.head == null) {
			this.head = myNode;
		}
		if(this.tail == null) {
			this.tail = myNode;
		}
		else {
			this.tail.setNext(myNode);
			this.tail = myNode;
		}
	}
	
	public void printMyNodes() {
		System.out.println("My Nodes: " + head);
	}
	
	@Override
	public String toString() {
		return "MyLinkedListNodes{" + head + '}';
	}
}
