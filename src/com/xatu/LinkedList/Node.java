package com.xatu.LinkedList;
/**
 * ָ�붨��
 * @author Administrator
 *
 */
public class Node {
	int data;
	int np;
	String names;
	Node next;

	public Node(int data, String names, int np) {
		this.np = np;
		this.names = names;
		this.data = data;
		this.next = null;
	}
}
