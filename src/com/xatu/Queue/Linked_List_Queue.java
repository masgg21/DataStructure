package com.xatu.Queue;

/**
 * 队列类
 * 
 * @author Administrator
 *
 */
public class Linked_List_Queue {
	public QueueNode front;// 队列的前端指针
	public QueueNode rear;// 队列的尾端指针

	// 构造函数
	public Linked_List_Queue() {
		front = null;
		rear = null;
	}

	// 方法enqueue;队列数据的存入
	public Boolean enqueue(int value) {
		QueueNode node = new QueueNode(value);// 建立节点
		// 检查是否为空队列
		if (rear == null)
			front = node;// 新建立的节点成为第一个节点
		else
			rear.next = node;// 将节点加入到队列的队尾
		rear = node;// 将队列的尾端指针指向新加入的节点
		return true;
	}

	// 队列的数据取出
	public int dequeue(int action) {
		int value;
		QueueNode tempNode, startNode;
		// 从前端取出数据
		if (!(front == null) && action == 1) {
			if (front == rear)
				rear = null;
			value = front.data;
			front = front.next;
			return value;
		}
		// 从尾端取出数据
		else if (!(rear == null) && action == 2) {
			startNode = front;// 先记下前端的指针指
			value = rear.data;// 取出目前尾端的数据
			// 找寻最尾端节点的前一个节点
			tempNode = front;
			while (front.next != rear && front.next != null) {
				front = front.next;
				tempNode = front;
			}
			front = startNode;// 记录从尾端取出数据后的队列前端指针
			rear = tempNode;// 记录从尾端取出数据后的队列尾段指针
			// 当队列中仅剩下最后节点时。取出数据后便将front和rear只想null
			if ((front.next == null) || (rear == null)) {
				front = null;
				rear = null;
			}
			return value;
		} else
			return -1;
	}
}
