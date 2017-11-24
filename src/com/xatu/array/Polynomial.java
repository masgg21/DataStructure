package com.xatu.array;

import java.util.Scanner;

/**
 * һԪ����ʽ�ļӷ����
 * ����һԪ����ʽת��Ϊ����Ϊn+2һά���飬��һ��λ�ô�����ָ��n
 * ����λ�ð���ָ���ݼ������δ洢��Ӧ��ϵ��
 * @author Administrator
 *
 */
public class Polynomial {
	 static int ITEMS;//���鳤��
	 /**
	  * �ֱ������������ʽ
	  * @param Poly
	  * @param items
	  */
     public static void PrintPoly(int Poly[],int items) {
    	 int i,MaxExp;
    	 MaxExp=Poly[0];
    	 for(i=1;i<=Poly[0]+1;i++) {
    		 MaxExp--;
    		 if (Poly[i]!=0) {
				if ((MaxExp+1)!=0) {
					System.out.print(Poly[i]+"X^"+(MaxExp+1));
				} 
				else  System.out.print(Poly[i]);
				if (MaxExp>=0) 
					System.out.print("+");
			 }
       	 }
    	 System.out.println();
     }
     /**
      * ����ʽ���
      * @param Poly1
      * @param Poly2
      */
     public static void PolySum(int Poly1[],int Poly2[]) {
    	 int j;
    	 int result[]=new int[ITEMS];
    	 result[0]=Poly1[0];
    	 for (j = 1; j < Poly1[0]+2; j++) 
		     result[j]=Poly1[j]+Poly2[j];//���ݵ�ϵ�����
		     PrintPoly(result, ITEMS);
		   }
     /**
      * ����ʽ����
      * @param Poly1
      * @param Poly2
      */
     public static void PolyReduce(int Poly1[],int Poly2[]) {
     	 int j;
    	 int result[]=new int[ITEMS];
    	 result[0]=Poly1[0];
    	 for (j = 1; j < Poly1[0]+2; j++) 
		     result[j]=Poly1[j]-Poly2[j];//���ݵ�ϵ�����
		     PrintPoly(result, ITEMS);
     }
     /**
      * �õ�����ʽ
      * @param args
      */
     public static int[] getArray() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("----------------------");
    	System.out.println("������һ�ζ���ʽ�����ָ��:");
		int n=sc.nextInt();
		int array[]=new int[n+2];
		array[0]=n;
		System.out.println("����������ϵ��:");
		for(int i=1;i<n+2;i++) {
			int m=sc.nextInt();
			array[i]=m;
		}
    	return array;
        } 
     public static void main(String[] args) {
    	//��������ʽ
    	System.out.println("���������ʽA:");
		int []PolyA=getArray();
		ITEMS=PolyA.length;
		System.out.print("����ʽ A=>");
		PrintPoly(PolyA, ITEMS);
		System.out.println("���������ʽB:");
		int []PolyB=getArray();
		ITEMS=PolyB.length;
		System.out.print("����ʽ B=>");
		PrintPoly(PolyB, ITEMS);
		//A+B
		System.out.print("A+B =>");
		PolySum(PolyA, PolyB);
		System.out.println();
		System.out.print("A-B =>");
		PolyReduce(PolyA, PolyB);
	 }
}
