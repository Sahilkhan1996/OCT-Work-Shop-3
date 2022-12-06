package com.bridgelabz.customlinkedlist;

public class CustomLinkedList {
	Node head;
	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		CustomLinkedList ll = new CustomLinkedList();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.printlist();
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = new Node(data);
			head.next=null;
			return;
		}
		Node tempNode = head;
		 head=newNode;
		newNode.next = tempNode;
		return;
	}

	public void printlist() {
		if (head == null) {
			System.out.println("Sorry! Please add any element " + "in the linked list and list is empty");
		}
		Node lastNode = head;
		while (lastNode != null) {
			System.out.print(lastNode.data + "-->");
			lastNode = lastNode.next;
		}
		System.out.println("null");
	}

}
