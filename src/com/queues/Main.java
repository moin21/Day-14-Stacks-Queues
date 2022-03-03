package com.queues;

public class Main {
	public static void main(String[] args) {
		
		QueueService list = new QueueService();
		list.enqueu(56);
		list.enqueu(30);
		list.enqueu(70);
		list.printList();
	}
}
