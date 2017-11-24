package com.wwj.string.learn;

public class StringLearn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="明天会更好";     //0x0079
		
		String today="明天会更好";   //0x0079
		
		String tomorrow=new String("明天会更好");  // 0x0035
		
		String good="明天会怎样";
		
		System.out.println(str==today);    //==比较的是对象的地址,也可以说是对象的引用  true
		
		System.out.println(today==tomorrow);  //false  1 通多new关键之创建一个对象在堆内存中放着呢  2 对象字符串常量池
		
		System.out.println(today==good);  //false
		
		System.out.println("=========="+today.equals(tomorrow));  //equals 比较的是对象的内容
		
		
		System.out.println(Integer.toHexString(tomorrow.hashCode()));
		System.out.println(Integer.toHexString(str.hashCode()));
		System.out.println(Integer.toHexString(today.hashCode()));
		

	}

}
