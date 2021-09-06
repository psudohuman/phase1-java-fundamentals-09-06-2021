package com.simplilearn.typecasting;

public class Example1 {

	public static void main(String[] args) {
		// TODO :: WAP for converting int , byte , short  => float , double , long.
		int num=512;
		float fnum=num;
		double dnum=num;
		long lnum=num;
		
		byte count=120;
		float fcount=count;
		double dcount=count;
		long lcount=count;
		
		short small=3000;
		float fsmall=small;
		double dsmall=small;
		long lsmall=small;
		
		System.out.println("Integer as float: "+ fnum);
		System.out.println("Integer as double: "+ dnum);
		System.out.println("Integer as long: "+ lnum);
		
		System.out.println("Byte as float: "+ fcount);
		System.out.println("Byte as double: "+ dcount);
		System.out.println("Byte as long: "+ lcount);
		
		System.out.println("Short as float: "+ fsmall);
		System.out.println("Short as double: "+ dsmall);
		System.out.println("Short as long: "+ lsmall);
	}

}
