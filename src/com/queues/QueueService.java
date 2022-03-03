package com.queues;

public class QueueService {
	static Node head;
	public static int count = 1;
/**
 * method to add element to the queue
 * @param data -  value to be assigned in queue
 */
	public void enqueu(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
	}

	/**
	 * Method to Print list Here first we check if stack is empty and give a message
	 * to user, if not we print every current Node starting from head, while
	 * changing to currentNode to next every time it prints one node.
	 */
	public void printList() {
		if (head == null) {
			System.out.println("Queue is empty.");
			return;
		}
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}

	}
}
