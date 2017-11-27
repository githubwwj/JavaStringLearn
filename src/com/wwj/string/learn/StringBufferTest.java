package com.wwj.string.learn;

/**
 * 线程安全的
 * @author wwj
 *
 */
public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer stringBuffer=new StringBuffer();
		
		stringBuffer.append("abcd").append(true).append('s').append("b").append(new Integer(5));
		
		System.out.println(stringBuffer);
		
		stringBuffer.insert(4, 'e');
		stringBuffer.insert(10, "h");
		
		
		System.out.println(stringBuffer);
		
		stringBuffer.delete(5, 9);
		
		System.out.println(stringBuffer);
		
		stringBuffer.reverse();
		
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder=new StringBuilder();  //1.5 因为没有加入同步锁,所以多线程访问是数据不安全的
		stringBuilder.append("hello").append(" world");
		
	}
	
	

}
