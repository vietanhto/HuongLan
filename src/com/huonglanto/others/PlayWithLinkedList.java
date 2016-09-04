package com.huonglanto.others;

public class PlayWithLinkedList {
	public static class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}

	static void print(Node head) {
		Node node = head;
		while (node != null) {
			System.out.print(String.format("%s, ", node.data));
			node = node.next;
		}
	}

	static void add(Node position, Node nodeToAdd) {
		Node temp = position.next;// O(1)
		position.next = nodeToAdd;
		nodeToAdd.next = temp;
	}

	static void remove(Node nodeToRemove) {
		// TODO write implementation
	}

	public static void main(String[] args) {
		Node node1 = new Node(10, null);
		Node node2 = new Node(20, null);
		node1.next = node2;
		Node node3 = new Node(30, null);
		node2.next = node3;

		Node nodeToAdd = new Node(200, null);
		add(node2, nodeToAdd);

		print(node1);

		remove(nodeToAdd);
		print(node1);// I expect to see the original list printed
	}
}
