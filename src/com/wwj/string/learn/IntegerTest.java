package com.wwj.string.learn;

public class IntegerTest {

	public static void main(String[] args) {
		
		Integer a=4; //b=new Integer(4);  自动装箱
		Integer b=new Integer(350);
		Integer c=new Integer(350);
		
		System.out.println(b==c);  //false
		System.out.println(b.equals(c)); //true
		
		Integer d1=127; //d1=new Integer(127);  自动装箱     -127 + 127
		Integer d2=127; //jdk1.5之后,一个字节,那么该数据会被共享，不会被重新开辟空间
		
		System.out.println("一个字节="+(d1==d2));  //true
		
		
		Integer d3=128; //d3=new Integer(128);  
		Integer d4=128; //d4=new Integer(128);
		
		System.out.println("超过一个个字节="+(d3==d4));  //false

	}

}
