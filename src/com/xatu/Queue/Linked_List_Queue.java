package com.xatu.Queue;

/**
 * ������
 * 
 * @author Administrator
 *
 */
public class Linked_List_Queue {
	public QueueNode front;// ���е�ǰ��ָ��
	public QueueNode rear;// ���е�β��ָ��

	// ���캯��
	public Linked_List_Queue() {
		front = null;
		rear = null;
	}

	// ����enqueue;�������ݵĴ���
	public Boolean enqueue(int value) {
		QueueNode node = new QueueNode(value);// �����ڵ�
		// ����Ƿ�Ϊ�ն���
		if (rear == null)
			front = node;// �½����Ľڵ��Ϊ��һ���ڵ�
		else
			rear.next = node;// ���ڵ���뵽���еĶ�β
		rear = node;// �����е�β��ָ��ָ���¼���Ľڵ�
		return true;
	}

	// ���е�����ȡ��
	public int dequeue(int action) {
		int value;
		QueueNode tempNode, startNode;
		// ��ǰ��ȡ������
		if (!(front == null) && action == 1) {
			if (front == rear)
				rear = null;
			value = front.data;
			front = front.next;
			return value;
		}
		// ��β��ȡ������
		else if (!(rear == null) && action == 2) {
			startNode = front;// �ȼ���ǰ�˵�ָ��ָ
			value = rear.data;// ȡ��Ŀǰβ�˵�����
			// ��Ѱ��β�˽ڵ��ǰһ���ڵ�
			tempNode = front;
			while (front.next != rear && front.next != null) {
				front = front.next;
				tempNode = front;
			}
			front = startNode;// ��¼��β��ȡ�����ݺ�Ķ���ǰ��ָ��
			rear = tempNode;// ��¼��β��ȡ�����ݺ�Ķ���β��ָ��
			// �������н�ʣ�����ڵ�ʱ��ȡ�����ݺ�㽫front��rearֻ��null
			if ((front.next == null) || (rear == null)) {
				front = null;
				rear = null;
			}
			return value;
		} else
			return -1;
	}
}
