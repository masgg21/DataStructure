package com.xatu.LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ʾ��:
 * �������ѧ���ɼ��ĵ�������
 * ����ÿһ���ڵ��ӡ��Ϣ
 * ��ͬ����ʵ���½ڵ�����
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
	System.out.println("���������ѧ���ĳɼ�:");
	LinkedList list=new LinkedList();
	for (int i = 1; i < 6; i++) {
		System.out.println("������ѧ��:");
		num=Integer.parseInt(buf.readLine());
		System.out.println("����������:");
		name=buf.readLine();
		System.out.println("������ɼ�:");
		score=Integer.parseInt(buf.readLine());
		list.insert(num, name, score);
		System.out.println("------------------");
	}
	System.out.println("ѧ���ɼ�:");
	System.out.println("ѧ�������ɼ� ==========");
	list.print();
} 
}
