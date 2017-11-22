package com.xatu.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 示例:
 * 建立五个学生成绩的单向链表
 * 访问每一个节点打印信息
 * 相同可以实现新节点的添加
 * @author Administrator
 *
 */
public class LinkedListTest {
   public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader buf=
	      new BufferedReader(new InputStreamReader(System.in));
	int num;
	String name;
	int score;
	System.out.println("请输入五个学生的成绩:");
	LinkedList list=new LinkedList();
	for (int i = 1; i < 6; i++) {
		System.out.println("请输入学号:");
		num=Integer.parseInt(buf.readLine());
		System.out.println("请输入姓名:");
		name=buf.readLine();
		System.out.println("请输入成绩:");
		score=Integer.parseInt(buf.readLine());
		list.insert(num, name, score);
		System.out.println("------------------");
	}
	System.out.println("学生成绩:");
	System.out.println("学号姓名成绩 ==========");
	list.print();
} 
}
