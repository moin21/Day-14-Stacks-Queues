package com.stacks;

public class StackService {
	static Node head;
	public static int count = 1;

	/**
	 * Method to pop new element is stack:
	 * 
	 * @param data - data to be added is used as parameter
	 * @return - if list is empty it head = newNode and return.
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;

	}

	/**
	 * Method to Print list Here first we check if stack is empty and give a message
	 * to user, if not we print every current Node starting from head, while
	 * changing to currentNode to next every time it prints one node.
	 */
	public void printList() {
		if (head == null) {
			System.out.println("Stack is empty");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}

	}
}
