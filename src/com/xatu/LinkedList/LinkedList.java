package com.xatu.LinkedList;

public class LinkedList {
	private Node first;
	private Node last;

	/**
	 * �жϵ�ǰ�����Ƿ�Ϊ��
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return first == null;
	}

	/**
	 * ��ӡ��ǰ�б�
	 */
	public void print() {
		Node current = first;
		while (current != null) {
			System.out.println("[" + current.data + " " + current.names + " " + current.np + "]");
			current = current.next;
		}
		System.out.println();
	}

	/**
	 * ��ָ���Ľڵ������Ŀǰ������
	 * 
	 * @param data
	 * @param names
	 * @param np
	 */
	public void insert(int data, String names, int np) {
		Node newNode = new Node(data, names, np);
		if (this.isEmpty()) {
			first = newNode;
			last = newNode;
		} else {
			last.next = newNode;
			last = newNode;
		}
	}

	/**
	 * ɾ��ָ���Ľڵ�
	 * 
	 * @param delNode
	 */
	public void delete(Node delNode) {
		Node newNode;
		Node temp;
		if (first.data == delNode.data) {
			first = first.next;
		} else if (last.data == delNode.data) {
			System.out.println("I am here \n");
			newNode = first;
			while (newNode.next != last)
				newNode = newNode.next;
			newNode.next = last.next;
			last = newNode;
		} else {
			newNode = first;
			temp = first;
			while (newNode.data != delNode.data) {
				temp = newNode;
				newNode = newNode.next;

			}
			temp.next = delNode.next;
		}
	}

	/**
	 * ����������������
	 * 
	 * @param head1
	 * @param head2
	 * @return
	 */
	public LinkedList Concatenate(LinkedList head1, LinkedList head2) {
		LinkedList ptr;
		ptr = head1;
		while (ptr.last.next != null) {
			ptr.last = ptr.last.next;
			ptr.last.next = head2.first;
		}
		return head1;
	}
}
