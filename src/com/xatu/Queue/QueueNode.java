package com.xatu.Queue;
/**
 * 队列节点类
 * @author Administrator
 *
 */
public class QueueNode {
   int data;//节点数据
   QueueNode next;//指向下一个节点
   public QueueNode(int data) {
	   this.data=data;
	   next=null;
   }
}
