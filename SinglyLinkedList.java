package com.mac.java.singly.linked.list;

class ListNode<T> {
	private Node<T> head = null;
	private int size = 0;

	class Node<T> {
		private T data;
		private Node<T> next;

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

	public boolean insert(T data) {
		Node<T> temp = new Node<>();
		temp.setData(data);
		if (head == null) {
			head = temp;
		} else {
			Node<T> next = head;
			while (next.getNext() != null) {
				next = next.getNext();
			}
			next.setNext(temp);
		}
		size += 1;
		return true;
	}

	public T get(int index) {
		T data = null;
		if (index < size) {
			Node<T> next = head;
			int count = 0;
			while (count != index && next.getNext() != null) {
				next = next.getNext();
				count += 1;
			}
			data = next.getData();
		} else {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return data;
	}

	public T remove() {
		T data = null;
		if (head != null || size > 0) {
			data = head.getData();
			head = head.getNext();
		}
		return data;
	}

	public T removeAt(int index) {
		T data = null;
		if (head != null && index < size) {
			Node<T> temp = head;
			int count = -1;
			while ((index - 1) != count && temp.getNext() != null) {
				temp = temp.getNext();
			}
			data = temp.getNext().getData();
			temp.setNext(temp.getNext().getNext());
		}
		return data;
	}

	/*
	 * replace() – Replace an element at a specified position by another element.
	 */

	public void delete() {

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return head == null || size == 0 ? true : false;
	}

	public void display() {
		if (head == null || size == 0) {
			System.out.println("List is Empty.");
		} else {
			Node<T> next = head;
			do {
				System.out.print(next.getData() + " -> ");
				next = next.getNext();
			} while (next != null);
			System.out.print("null");
		}
	}

	public void reverse() {
		Node<T> temp = null, next = null;
		if (head != null && head.next != null) {
			next = head.getNext();
		} else {
			return;
		}

		while (next != null) {
			head.setNext(temp);
			temp = head;
			head = next;
			next = next.getNext();
		}
		head.setNext(temp);
	}

	public void reverse(int blockSize) {
		Node<T> prev = head, temp = null, next = null;
		// To check the linked list is empty or not.
		if (head != null && head.next != null) {
			next = head.getNext();
		} else {
			return;
		}
		int count = 0;
		// To reverse the linked list block by block.
		while (next != null && count < blockSize) {
			head.setNext(temp);
			temp = head;
			head = next;
			next = next.getNext();
			count++;
		}
		System.out.println("\nHead : " + head);
		System.out.println("Temp : " + temp);
		System.out.println("Prev : " + prev);
		System.out.println("Next : " + next);
		// To handle if remaining elements is less than the block size.
		if (count < blockSize) {
			head.setNext(temp);
		} else {
			prev.setNext(head);
			head = temp;
		}
		count = 0;
	}

	public void reverseByBlockUsingRecursion(int blockSize) {
		head = reverseByBlock(head, blockSize);
	}

	private Node<T> reverseByBlock(Node<T> head, int blockSize) {
		Node<T> prev = head, temp = null, next = null;
		// Base Condition to check the head is null or it's containing only one node or not.
		if (head == null || head.getNext() == null) {
			return head;
		}
		// To check the head is containing more than one node or not.
		if (head != null && head.getNext() != null) {
			next = head.getNext();
		}
		int count = 0;
		// To reverse the linked list block by block.
		while (next != null && count < blockSize) {
			head.setNext(temp);
			temp = head;
			head = next;
			next = next.getNext();
			count++;
		}
		prev = temp;
		while (prev.getNext() != null) {
			prev = prev.getNext();
		}
		prev.setNext(reverseByBlock(head, blockSize));
		return temp;
	}

	@Override
	public String toString() {
		return "ListNode [data=" + head.getData() + ", next=" + head.getNext() + "]";
	}

}

public class SinglyLinkedList {

	public static void main(String[] args) {
		ListNode<Integer> singlyLinkedList = new ListNode<Integer>();
		singlyLinkedList.insert(1);
		singlyLinkedList.insert(2);
		singlyLinkedList.insert(3);
		singlyLinkedList.insert(4);
		singlyLinkedList.insert(5);
		singlyLinkedList.insert(6);
		singlyLinkedList.insert(7);
		singlyLinkedList.insert(8);
		singlyLinkedList.insert(9);
		singlyLinkedList.insert(10);

		singlyLinkedList.display();
//		singlyLinkedList.reverse();
//		singlyLinkedList.reverse(3);
		singlyLinkedList.reverseByBlockUsingRecursion(3);
		System.out.println();
		singlyLinkedList.display();

//		System.out.println(singlyLinkedList.isEmpty());
//		singlyLinkedList.insert(100);
//		singlyLinkedList.insert(200);
//		singlyLinkedList.insert(300);
//		singlyLinkedList.insert(400);
//		singlyLinkedList.insert(500);

//		singlyLinkedList.removeAt(1);

//		System.out.println("Get an Element : " + singlyLinkedList.get(3));
//		System.out.println("Remove an Element : " + singlyLinkedList.remove());
//		singlyLinkedList.display();

	}

}
