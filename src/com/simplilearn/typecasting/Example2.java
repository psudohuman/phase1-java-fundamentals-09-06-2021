package com.simplilearn.typecasting;

public class Example2 {

	public static void main(String[] args) {
		// TODO WAP for converting long, float , int => byte , short double.
		long num=423141;
		byte bnum=(byte) num;
		short snum=(short) num;
		double dnum= num;
		
		float count=512.78f;
		byte bcount=(byte) count;
		short scount=(short) count;
		double dcount= count;
		
		int integer=732;
		byte binteger=(byte) integer;
		short sinteger=(short) integer;
		double dinteger= integer;
		
		System.out.println("Long: "+ num);
		System.out.println("Long as Byte: "+ bnum);
		System.out.println("Long as short: "+ snum);
		System.out.println("Long as double: "+ dnum);
		System.out.println("-------------------------");
		
		System.out.println("Float: "+ count);
		System.out.println("Float as Byte: "+ bcount);
		System.out.println("Float as short: "+ scount);
		System.out.println("Float as double: "+ dcount);
		System.out.println("-------------------------");
		
		System.out.println("Integer: "+ integer);
		System.out.println("Integer as Byte: "+ binteger);
		System.out.println("Integer as short: "+ sinteger);
		System.out.println("Integer as double: "+ dinteger);
		
	}

}
