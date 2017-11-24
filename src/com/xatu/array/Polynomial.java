package com.xatu.array;

import java.util.Scanner;

/**
 * 一元多项式的加法求和
 * 定义一元多项式转换为长度为n+2一维数组，第一个位置存放最大指数n
 * 其他位置按照指数递减，依次存储相应的系数
 * @author Administrator
 *
 */
public class Polynomial {
	 static int ITEMS;//数组长度
	 /**
	  * 分别输出两个多项式
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
      * 多项式相加
      * @param Poly1
      * @param Poly2
      */
     public static void PolySum(int Poly1[],int Poly2[]) {
    	 int j;
    	 int result[]=new int[ITEMS];
    	 result[0]=Poly1[0];
    	 for (j = 1; j < Poly1[0]+2; j++) 
		     result[j]=Poly1[j]+Poly2[j];//等幂的系数相加
		     PrintPoly(result, ITEMS);
		   }
     /**
      * 多项式减法
      * @param Poly1
      * @param Poly2
      */
     public static void PolyReduce(int Poly1[],int Poly2[]) {
     	 int j;
    	 int result[]=new int[ITEMS];
    	 result[0]=Poly1[0];
    	 for (j = 1; j < Poly1[0]+2; j++) 
		     result[j]=Poly1[j]-Poly2[j];//等幂的系数相加
		     PrintPoly(result, ITEMS);
     }
     /**
      * 得到多项式
      * @param args
      */
     public static int[] getArray() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("----------------------");
    	System.out.println("请输入一次多项式的最大指数:");
		int n=sc.nextInt();
		int array[]=new int[n+2];
		array[0]=n;
		System.out.println("请输入各项的系数:");
		for(int i=1;i<n+2;i++) {
			int m=sc.nextInt();
			array[i]=m;
		}
    	return array;
        } 
     public static void main(String[] args) {
    	//建立多项式
    	System.out.println("请输入多项式A:");
		int []PolyA=getArray();
		ITEMS=PolyA.length;
		System.out.print("多项式 A=>");
		PrintPoly(PolyA, ITEMS);
		System.out.println("请输入多项式B:");
		int []PolyB=getArray();
		ITEMS=PolyB.length;
		System.out.print("多项式 B=>");
		PrintPoly(PolyB, ITEMS);
		//A+B
		System.out.print("A+B =>");
		PolySum(PolyA, PolyB);
		System.out.println();
		System.out.print("A-B =>");
		PolyReduce(PolyA, PolyB);
	 }
}
